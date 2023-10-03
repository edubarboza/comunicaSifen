/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.fecyl.comunicasifen.bean;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBTransactionRolledbackException;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.ws.rs.core.Response;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import org.w3c.dom.Element;
import py.com.fecyl.comunicasifen.util.ConsultaRucRequest;
import py.com.fecyl.comunicasifen.util.KResponse;
import py.com.fecyl.comunicasifen.util.ServiciosSoap;
import py.com.fecyl.comunicasifen.util.ServiciosXml;
import py.com.fecyl.comunicasifen.util.SifenResponseModelLote;
import py.com.fecyl.comunicasifen.util.SifenResponseMoldelDE;
import py.com.fecyl.comunicasifen.wsdl.de.RProtDe;

/**
 *
 * @author luis.barboza
 */
@Stateless
public class SifenServices {
    
    @EJB
    ServiciosSoap serviciosSoap;
    
    @Inject
    ServiciosXml serviciosXml;
    
    @EJB
    EventServices eventServices;
    
    private final Logger logger = LogManager.getLogManager().getLogger(SifenServices.class.getName());
    
     public Object consultarDE(InputStream xmlInputStream) {
        logger.info("Ejecutando comunicaSifen consultar DE");
        KResponse response = new KResponse();
        //Respuesta de sifen al mensaje de consulta de DE
        SOAPMessage sifenResponse = null;
        //Mensaje xml en formato soap
        SOAPMessage xmlSoapConsultaDE = null;
        String jsonString, cdc;
        JsonObject jsonObject;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(xmlInputStream, StandardCharsets.UTF_8));
            StringBuilder jsonBuilder = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                jsonBuilder.append(responseLine.trim());
            }
            jsonString = jsonBuilder.toString();
        } catch (IOException e) {
            logger.severe("Error al transformar el inputStream a String");
            e.printStackTrace();
            response.setEstado(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
            response.setMensaje("Error al transformar el inputStream a String");
            response.setDato(e.getMessage());
            return response;
        }

        JsonReader jsonReader = Json.createReader(new StringReader(jsonString));
        jsonObject = jsonReader.readObject();
        cdc = jsonObject.getString("cdc");

        try {
            //Genera el mensaje SOAP que contiene el xml de evento
            xmlSoapConsultaDE = serviciosSoap.crearXmlConsultaDE(cdc);
        } catch (Exception e) {
            response.setEstado(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
            response.setMensaje("Error en comunicaSifen consultaDE al generar el mensaje SOAP de consulta de un DE "
                    + "enviar a SIFEN ");
            response.setDato(e.getMessage());
            return response;
        }

        try {
            //Obtiene la direccion http de sifen para consulta DE
            String sifenConsultaDeUrl = "https://sifen.set.gov.py/de/ws/consultas/consulta.wsdl";
            //envia el mensaje a la url y obtiene la respuesta
            sifenResponse = sendXmlSoap(xmlSoapConsultaDE, sifenConsultaDeUrl);
        } catch (Exception e) {
            response.setEstado(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
            response.setMensaje("Error en comunicaSifen al enviar el mensaje SOAP al SIFEN para consular DE");
            response.setDato(e.getMessage());
            return response;
        }

        response.setEstado(Response.Status.OK.getStatusCode());
        response.setMensaje("Consulta DE exitosa");
        try {
            String textContent = sifenResponse.getSOAPBody().getElementsByTagName("ns2:xContenDE").item(0).getTextContent();
            response.setDato(textContent);
        } catch (SOAPException ex) {
            Logger.getLogger(SifenServices.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(SifenServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    }
     
    public Object consultarRUC(InputStream xmlInputStream) {
        logger.info("Ejecutando comunicaSifen consultar RUC");
        KResponse response = new KResponse();
        //Respuesta de sifen al mensaje de consulta de DE
        SOAPMessage sifenResponse = null;
        //Mensaje xml en formato soap
        SOAPMessage xmlSoapConsultaRUC = null;
        String jsonString, ruc;
        JsonObject jsonObject;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(xmlInputStream, StandardCharsets.UTF_8));
            StringBuilder jsonBuilder = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                jsonBuilder.append(responseLine.trim());
            }
            jsonString = jsonBuilder.toString();
        } catch (IOException e) {
            logger.severe("Error al transformar el inputStream a String");
            e.printStackTrace();
            response.setEstado(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
            response.setMensaje("Error al transformar el inputStream a String");
            response.setDato(e.getMessage());
            return response;
        }

        JsonReader jsonReader = Json.createReader(new StringReader(jsonString));
        jsonObject = jsonReader.readObject();
        ruc = jsonObject.getString("drucCons");

        try {
            //Genera el mensaje SOAP que contiene el xml de evento
            xmlSoapConsultaRUC = serviciosSoap.crearXmlConsultaRUC(ruc);
        } catch (Exception e) {
            response.setEstado(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
            response.setMensaje("Error en comunicaSifen consultaDE al generar el mensaje SOAP de consulta de un DE "
                    + "enviar a SIFEN ");
            response.setDato(e.getMessage());
            return response;
        }

        try {
            //Obtiene la direccion http de sifen para consulta DE
            String sifenConsultaDeUrl = "https://sifen-test.set.gov.py/de/ws/consultas/consulta-ruc.wsdl";
            //envia el mensaje a la url y obtiene la respuesta
            sifenResponse = sendXmlSoap(xmlSoapConsultaRUC, sifenConsultaDeUrl);
        } catch (Exception e) {
            response.setEstado(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
            response.setMensaje("Error en comunicaSifen al enviar el mensaje SOAP al SIFEN para consular DE");
            response.setDato(e.getMessage());
            return response;
        }

        response.setEstado(Response.Status.OK.getStatusCode());
        response.setMensaje("Consulta RUC exitosa");
        try {
            String textContent = sifenResponse.getSOAPBody().getElementsByTagName("ns2:xContenDE").item(0).getTextContent();
            response.setDato(textContent);
        } catch (SOAPException ex) {
            Logger.getLogger(SifenServices.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(SifenServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    } 
    
    public Object consultarRUC(ConsultaRucRequest rucRequest) {
        logger.info("Ejecutando comunicaSifen consultar RUC");
        KResponse response = new KResponse();
        //Respuesta de sifen al mensaje de consulta de DE
        SOAPMessage sifenResponse = null;
        //Mensaje xml en formato soap
        SOAPMessage xmlSoapConsultaRUC = null;
        
        try {
            //Genera el mensaje SOAP que contiene el xml de evento
            xmlSoapConsultaRUC = serviciosSoap.crearXmlConsultaRUC(rucRequest.getNroDocumento());
        } catch (Exception e) {
            response.setEstado(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
            response.setMensaje("Error en comunicaSifen consultaDE al generar el mensaje SOAP de consulta de un DE "
                    + "enviar a SIFEN ");
            response.setDato(e.getMessage());
            return response;
        }

        try {
            //Obtiene la direccion http de sifen para consulta DE
            String sifenConsultaDeUrl = "https://sifen.set.gov.py/de/ws/consultas/consulta-ruc.wsdl";
            //envia el mensaje a la url y obtiene la respuesta
            sifenResponse = sendXmlSoap(xmlSoapConsultaRUC, sifenConsultaDeUrl);
        } catch (Exception e) {
            response.setEstado(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
            response.setMensaje("Error en comunicaSifen al enviar el mensaje SOAP al SIFEN para consular RUC");
            response.setDato(e.getMessage());
            return response;
        }

        response.setEstado(Response.Status.OK.getStatusCode());
        response.setMensaje("Consulta RUC exitosa");
        try {
            String textContent = sifenResponse.getSOAPBody().getElementsByTagName("ns2:xContRUC").item(0).getTextContent();
            response.setDato(textContent);
        } catch (SOAPException ex) {
            Logger.getLogger(SifenServices.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(SifenServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    }
    
    public KResponse sendDeToSifen(InputStream xmlIs) {
        logger.info("Ejecutando comunicaSifen DE");
        KResponse response = new KResponse();
        Element soapDe;
        try {
            soapDe = serviciosSoap.createDEelement(xmlIs);
            RProtDe soapResponse = serviciosSoap.sendDeToSifen(soapDe);
            //RProtDe soapResponse = serviciosSoap.testError();
            SifenResponseMoldelDE sifenResponse = new SifenResponseMoldelDE(soapResponse);
            //databaseOperations.updateDE(sifenResponse, soapResponse);
            response.setEstado(Response.Status.OK.getStatusCode());
            response.setMensaje(sifenResponse.getdEstRes() + ":" + sifenResponse.getdMsgRes());
            return response;
        } catch (EJBTransactionRolledbackException e) {
            //Cuando no se puede comunicar con el servidor SIFEN, el codigo de error es 99
            response.setEstado(99);
            response.setMensaje(e.getMessage());
            response.setDato(e.getCause());
            return response;
        } catch (Exception e) {
            logger.severe("Error al enviar el xml al SIFEN. Causa: " + e.getMessage());
            response.setEstado(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
            response.setMensaje(e.getMessage());
            response.setDato(e.getCause());
            return response;
        }
    }
     
    private SOAPMessage sendXmlSoap(SOAPMessage xmlSoapEvent, String sifenUrl) throws SOAPException, IOException {
        System.out.println("URL: " + sifenUrl);
        System.out.println("Mensaje: ");
        //Crear la conexion SOAP
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();
        try {
            serviciosSoap.doTrustToCertificates();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (CertificateException e) {
            e.printStackTrace();
        } catch (UnrecoverableKeyException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
        SOAPMessage sifenResponse = null;
        try {
            sifenResponse = soapConnection.call(xmlSoapEvent, sifenUrl);
        } catch (SOAPException e) {
            e.printStackTrace();
        }

        //Imprime la respuesta SOAP
        System.out.println("Respuesta SOAP:");
        try {
            sifenResponse.writeTo(System.out);
            soapConnection.close();
            //sifenResponse.writeTo(new FileOutputStream("/home/alex/IdeaProjects/com-sifen/output/soapmessage.txt"));

            System.out.println();

            //cerrar la conexion un vez terminada la operacion
            return sifenResponse;
        } catch (SOAPException e) {
            throw new SOAPException("Error en comunicaSifen al enviar el mensaje SOAP a SIFEN", e.getCause());
        } catch (IOException e) {
            throw new IOException("Error en comunicaSifen al escribir la respuesta en el flujo de salida de datos", e.getCause());
        }

    }

    public void printSoap(SOAPMessage soapMessage) {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            soapMessage.writeTo(out);
        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String strMsg = new String(out.toByteArray());
        System.out.println(strMsg);
    }
    
     public KResponse sendXmlSoapEvent(InputStream xmlInputStream) {
        logger.info("Ejecutando comunicaSifen evento");
        KResponse response = new KResponse();
        //Respuesta de sifen al mensaje al pedido de cancelacion
        SOAPMessage sifenResponse = null;
        //Mensaje xml en formato soap
        SOAPMessage xmlSoapEvent = null;

        try {
            //Genera el mensaje SOAP que contiene el xml de evento
            xmlSoapEvent = serviciosSoap.crearXmlEventoSoap(xmlInputStream);
        } catch (Exception e) {
            response.setEstado(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
            response.setMensaje("Error en comunicaSifen evento al generar el mensaje SOAP de cancelacion de eventos para "
                    + "enviar a SIFEN ");
            response.setDato(e.getMessage());
            return response;
        }

        try {
            String sifenEventUrl= "URL_EVENTO";
            //envia el mensaje a la url y obtiene la respuesta
            sifenResponse = sendXmlSoap(xmlSoapEvent, sifenEventUrl);
        } catch (Exception e) {
            response.setEstado(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
            response.setMensaje("Error en comunicaSifen al enviar el mensaje SOAP al SIFEN para cancelar los eventos");
            response.setDato(e.getMessage());
            return response;
        }

        //Obtiene los datos del mensaje y la respuesta y actualiza los datos de la tabla eventos
        String result = eventServices.updateEventData(xmlSoapEvent, sifenResponse);
        if (result != null) {
            response.setEstado(Response.Status.OK.getStatusCode());
            response.setMensaje(result);
            return response;
        } else {
            response.setEstado(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
            response.setMensaje("Los eventos fueron enviado a SIFEN, pero ocurrio un error en comunicaSifen al "
                    + "actualizar los datos de los eventos enviados");
            return response;
        }
    }
     
     public KResponse sendLoteToSifen(InputStream streamXml, String loteId) {
        logger.info("Ejecutando comSifen Lote");
        KResponse response = new KResponse();
        try {
            SifenResponseModelLote loteHelper = serviciosSoap.sendLoteToSifen(streamXml, loteId);
            //databaseOperations.updateLote(loteHelper);
            response.setEstado(Response.Status.OK.getStatusCode());
            response.setMensaje(loteHelper.getdMsgRes().value);
            return response;
        } catch (Exception e) {
            response.setEstado(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
            response.setMensaje(e.getMessage());
            return response;
        }

    }
 
    
}
