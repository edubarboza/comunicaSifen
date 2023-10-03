package py.com.fecyl.comunicasifen.bean;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import py.com.fecyl.comunicasifen.util.ServiciosXml;

@Stateless
public class EventServices {

    //Codigo que indica que el evento fue registrado correctamente en SIFEN
    String EXITO = "0600";

    @Inject
    ServiciosXml serviciosXml;

    public String updateEventData(SOAPMessage soapMessage, SOAPMessage soapResponse){

        //Respuestas del sifen a cada uno de los eventos de cancelacion
        List<String> respuestas = new ArrayList<>();
        //Indica si el almacenamiento del los eventos fue exitoso
        Boolean eventStored = false;
        //Mensaje xml enviado al sifen en formato string
        String soapMessageString = null;
        //Mensaje xml de respuesta del sifen en formato string
        String soapResponseString = null;
        //Respuesta de SIFEN a cada uno de los DE que se desea cancelar
        NodeList respuestasEventos = null;
        //fecha y hora del procesamiento del mensaje SOAP en SIFEN
        String dFecProc = null;

        Document docRespuesta= null;
        try {
            dFecProc = soapResponse.getSOAPBody().getElementsByTagName("ns2:dFecProc").item(0).getTextContent();
            soapMessageString = getStringFromDocument(soapMessage.getSOAPBody().getOwnerDocument());
            soapResponseString = convertToString(soapResponse.getSOAPBody());
//            respuestasEventos = soapResponse.getSOAPBody().getElementsByTagName("ns2:gResProcEVe");
            docRespuesta=serviciosXml.stringToDocument(soapResponseString);
            respuestasEventos= docRespuesta.getElementsByTagName("ns2:gResProcEVe");



        } catch (Exception e) {
           System.err.println("Error al obtener datos del los mensajes SOAP para actualizar datos");
           System.err.println(e.getMessage());
           return null;

        }
        for(int i = 0; i<respuestasEventos.getLength(); i++){
            Element respuestaEvento = (Element)respuestasEventos.item(i);
            String dEstRes = null, dCodRes = null, dMsgRes = null, idEvento = null, dProtAut = null;
            try{
                //Sección respuesta sifen
                //Estado del resultado
                dEstRes = respuestaEvento.getElementsByTagName("ns2:dEstRes").item(0).getTextContent();
                //Código del resultado de procesamiento
                dCodRes = respuestaEvento.getElementsByTagName("ns2:dCodRes").item(0).getTextContent();
                //Mensaje del resultado de procesamiento
                dMsgRes = respuestaEvento.getElementsByTagName("ns2:dMsgRes").item(0).getTextContent();
                //identificador del evento
                idEvento = respuestaEvento.getElementsByTagName("ns2:id").item(0).getTextContent();

                //Si el evento fue registrado correctamente en SIFEN
                if (dCodRes.equals(EXITO)) {
                    //Número de transacción que devuelve sifen
                    dProtAut = respuestaEvento.getElementsByTagName("ns2:dProtAut").item(0).getTextContent();
                }
            }catch (Exception e){
                System.err.println("Error al obtner los datos de un mensaje de cancelacion de un DE");
                return null;
            }
            
            //Actualiza la tabla fe_eventos y completa la tabla fe_eventos_xml
            //eventStored = databaseOperations.storeCancellationEvent(dEstRes, dCodRes, dMsgRes, dProtAut, dFecProc,
            //            idEvento, soapMessageString);
            
            /*
            if(eventStored){
                respuestas.add("Evento con ID: "+ idEvento + " enviado a SIFEN y actualizado en com-sifen. Mensaje SIFEN: " +
                        dEstRes + " " + dMsgRes);
                eventStored = false;
            }else{
                respuestas.add("Evento con ID: "+ idEvento + " enviado a SIFEN pero no fue actualizado en com-sifen. Mensaje SIFEN: " +
                        dEstRes + " " + dMsgRes);
            }
            */
        }
        //Si los eventos fuenron almacenados correctamente
        return soapResponseString;

    }
    public static String getStringFromDocument(Document doc){
        try{

            DOMSource domSource = new DOMSource(doc);
            StringWriter writer = new StringWriter();
            StreamResult result = new StreamResult(writer);
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.transform(domSource, result);
            return writer.toString();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    private String convertToString (SOAPBody message) throws Exception{
        Document doc = message.extractContentAsDocument();
        StringWriter sw = new StringWriter();
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.transform(new DOMSource(doc), new StreamResult(sw));
        return sw.toString();
    }
}
