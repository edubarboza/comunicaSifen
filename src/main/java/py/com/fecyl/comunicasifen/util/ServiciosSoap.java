package py.com.fecyl.comunicasifen.util;



import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.ejb.EJBTransactionRolledbackException;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.handler.Handler;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.*;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.ejb.EJB;
import py.com.fecyl.comunicasifen.bean.SoapMessageHandler;

@Stateless
public class ServiciosSoap {

    private final Logger logger = LogManager.getLogManager().getLogger(ServiciosSoap.class.getName());

    @Inject
    private LoadProperties loadProperties;
    
    @Inject
    ServiciosXml serviciosXml;

    public void doTrustToCertificates() throws NoSuchAlgorithmException, KeyStoreException, IOException, CertificateException, UnrecoverableKeyException, KeyManagementException {
//        System.setProperty("javax.net.ssl.trustStore", "/home/alex/IdeaProjects/com-sifen/src/main/resources/konecta.jks");
//        System.setProperty("javax.net.ssl.trustStorePassword", "Cambiar123");

        // Set keystore that contains private key
        String keystoreURL = loadProperties.getKEY_STORE_URL();
        InputStream inputStream = new FileInputStream(keystoreURL);
        //InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("keystoreKonecta.jks");
        String pKeyPassword = loadProperties.getKEY_PASS();
        //String pKeyPassword = "4jd3GAd35U3skXJ8";
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
//        InputStream keyInput = new FileInputStream(inputStream);
        keyStore.load(inputStream, pKeyPassword.toCharArray());
//        inputStream.close();
        keyManagerFactory.init(keyStore, pKeyPassword.toCharArray());

        // Set ssl context with private key and truststore details
        SSLContext sc = SSLContext.getInstance("TLSv1");
        sc.init(keyManagerFactory.getKeyManagers(), null, new SecureRandom());
        SSLSocketFactory sockFact = sc.getSocketFactory();

        // Add ssl context to https connection
        HttpsURLConnection.setDefaultSSLSocketFactory(sockFact);
    }

    public static byte[] zipBytes(String filename, byte[] input) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipOutputStream zos = new ZipOutputStream(baos);
        ZipEntry entry = new ZipEntry(filename);

        entry.setSize(input.length);
        zos.putNextEntry(entry);
        zos.write(input);
        zos.closeEntry();
        zos.close();
        return baos.toByteArray();
    }

    public void printDOC(Document doc) throws TransformerException {
        DOMSource domSource = new DOMSource(doc);
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.transform(domSource, result);
        System.out.println(result);
    }

    public SOAPMessage crearXmlEventoSoap(InputStream xmlInputStream) throws SOAPException, ParserConfigurationException, IOException, SAXException {
        System.setProperty("javax.xml.soap.MessageFactory", "com.sun.xml.internal.messaging.saaj.soap.ver1_2.SOAPMessageFactory1_2Impl");

        try {

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            docFactory.setNamespaceAware(true);
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            docBuilder.isNamespaceAware();
            //Crea el archivo document a partir del stream del mensaje
//            Scanner s = new Scanner(xmlInputStream, "UTF-8").useDelimiter("\\A");
//            String xmlString = s.hasNext() ? s.next() : "";
//            Document docXml = serviciosXml.stringToDocument(xmlString);
            Document docXml= docBuilder.parse(new InputSource(xmlInputStream));

            //remueve la cabecera del archivo xml
            //String cadenaXmlSinCabecera = cadenaXml.replace("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n", "");
            //Crea el request, y que sea acorde a la version soap 1.2
            MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
            //Crea el esqueleto de un mensaje SOAP
            SOAPMessage soapRequest = messageFactory.createMessage();

            SOAPPart part = soapRequest.getSOAPPart();

            SOAPEnvelope envelope = part.getEnvelope();

            String serverURI = "http://ekuatia.set.gov.py/sifen/xsd";
            String nameSpace = "xsd";

            envelope.addNamespaceDeclaration(nameSpace, serverURI);
            envelope.removeNamespaceDeclaration("env");
            envelope.setPrefix("soap");

            SOAPHeader header = envelope.getHeader();
            header.setPrefix("soap");

            //Obtiene el cuerpo del mensaje SOAP
            SOAPBody body = envelope.getBody();
            body.setPrefix("soap");

            //Crea la primera etiqueta del cuerpo del mensaje SOAP
            SOAPElement rEnviEventoDe = body.addChildElement("rEnviEventoDe", nameSpace);

            //Obtiene el id de la entrada en la tabla fe_eventos
            Node rEveNode = docXml.getElementsByTagName("rEve").item(0);
            NamedNodeMap deNodeMap = rEveNode.getAttributes();
            String rEveNodeId = deNodeMap.getNamedItem("Id").getTextContent();

            SOAPElement dId = rEnviEventoDe.addChildElement("dId", nameSpace);
            dId.addTextNode(rEveNodeId);

            SOAPElement dEvReg = rEnviEventoDe.addChildElement("dEvReg", nameSpace);

            SOAPElement soapXml = body.addDocument(docXml);
            //TODO: Ver por que algunas veces sale el error "java.lang.IllegalStateException", pero se arregla reiniciando el servidor
            dEvReg.addChildElement(soapXml);

            //Imprime el request SOAP
            //System.out.println("Mensaje SOAP:");
            //soapRequest.writeTo(System.out);
            //System.out.println();
            return soapRequest;

        } catch (SOAPException e) {
            throw new SOAPException("Error en comSifen al crear el mensaje SOAP");
        } catch (ParserConfigurationException e) {
            throw new ParserConfigurationException("Error en comSifen al parsear el InputStream a Document");
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        } catch (SAXException e) {
            throw new SAXException(e.getMessage());
        }
    }

    public Element createDEelement(InputStream xmlIs) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        docFactory.setNamespaceAware(true);
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        docBuilder.isNamespaceAware();
        //Crea el archivo document a partir del stream del mensaje
        Document docXml = docBuilder.parse(new InputSource(xmlIs));
        //Crea un elemento soap a partir del archivo document
        return docXml.getDocumentElement();
    }

    /*public RProtDe sendDeToSifen(Element soapDe) throws Exception {
        doTrustToCertificates();
        DeWsSyncRecibeService service;
        DeWsSyncRecibe port;
        try {
            service = new DeWsSyncRecibeService();
            //envia el mensaje a la url y obtiene la respuesta
            port = service.getDeWsSyncRecibeSoap12();
        } catch (WebServiceException e) {
            logger.severe("Error al comunicarse con el servidor SIFEN");
            throw e;
        }

        BindingProvider provider = (BindingProvider) port;
        String SIFEN_RECIBE_API_URL = null;
        try {
            SIFEN_RECIBE_API_URL = databaseOperations.obtenerConfiguracion("url_sifen_envio_de",
                    Boolean.parseBoolean(loadProperties.getUSAR_URL_PRODUCCION()));
        } catch (Exception e) {
            logger.severe("Error al obtener la configuracion de la base de datos");
            throw e;
        }

        provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, SIFEN_RECIBE_API_URL);
        try {
            provider.getRequestContext().put(JAXWSProperties.SSL_SOCKET_FACTORY, getCustomSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        Binding binding = provider.getBinding();
        List<Handler> handlerList = binding.getHandlerChain();
        handlerList.add(new SoapMessageHandler());
        binding.setHandlerChain(handlerList);

        REnviDe.XDE xDE = new REnviDe.XDE();
        xDE.setAny(soapDe);
        String dId = xDE.getAny().getElementsByTagName("dDVId").item(0).getTextContent();
        return port.rEnviDe(new BigInteger(dId), xDE);
    }*/

    /*public SifenResponseModelLote sendLoteToSifen(InputStream streamXml, String loteId) throws Exception {
        doTrustToCertificates();
        DeWsAsyncRecibeService service = new DeWsAsyncRecibeService();
        //envia el mensaje a la url y obtiene la respuesta
        DeWsAsyncRecibe port = service.getDeWsAsyncRecibeSoap12();

        BindingProvider provider = (BindingProvider) port;
        try {
            //url envio de un lote de DEs a SIFEN
            
            String SIFEN_RECIBE_LOTE_API_URL = databaseOperations.obtenerConfiguracion("url_sifen_envio_lote",
                    Boolean.parseBoolean(loadProperties.getUSAR_URL_PRODUCCION()));
            
            provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                    SIFEN_RECIBE_LOTE_API_URL);
            provider.getRequestContext().put("javax.xml.ws.client.connectionTimeout", 30 * 1000);
            provider.getRequestContext().put("javax.xml.ws.client.receiveTimeout", 30 * 1000);


        } catch (Exception e) {
            throw e;
        }
        try {
            provider.getRequestContext().put(JAXWSProperties.SSL_SOCKET_FACTORY, getCustomSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Binding binding = provider.getBinding();
        List<Handler> handlerList = binding.getHandlerChain();
        handlerList.add(new SoapMessageHandler());
        binding.setHandlerChain(handlerList);
        DataSource source = null;
        byte[] test = null;
        try {
            test = zipBytes("lote.zip", IOUtils.toByteArray(streamXml));
            source = new ByteArrayDataSource(test, "application/zip");
        } catch (IOException e) {
            e.printStackTrace();
        }
        DataHandler xDE = new DataHandler(source);

        Holder<XMLGregorianCalendar> dFecProc = new Holder<XMLGregorianCalendar>();
        Holder<String> dCodRes = new Holder<String>();
        Holder<String> dMsgRes = new Holder<String>();
        Holder<Long> dProtConsLote = new Holder<Long>();
        Holder<BigInteger> dTpoProces = new Holder<BigInteger>();
        BigInteger loteIdBigInt = new BigInteger(loteId);
        port.rEnvioLote(loteIdBigInt, xDE, dFecProc, dCodRes, dMsgRes, dProtConsLote, dTpoProces);

        return new SifenResponseModelLote(xDE, dFecProc, dCodRes, dMsgRes, dProtConsLote, dTpoProces, loteIdBigInt);
    }*/

    private Object getCustomSocketFactory() throws Exception {
        SSLContext sc = SSLContext.getInstance("SSLv3");

        KeyManagerFactory kmf
                = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());

        KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
        String keystoreURL = loadProperties.getKEY_STORE_URL();
        InputStream fin = new FileInputStream(keystoreURL);
        String storePass = loadProperties.getSTORE_PASS();
        ks.load(fin, storePass.toCharArray());
        kmf.init(ks, storePass.toCharArray());

        sc.init(kmf.getKeyManagers(), null, null);

        return sc.getSocketFactory();
    }

    /*public RProtDe testError() throws Exception {

        throw new EJBTransactionRolledbackException("Error al conectarse");
    }*/

    public SOAPMessage crearXmlConsultaDE(String cdc) throws SOAPException, IOException {
        System.setProperty("javax.xml.soap.MessageFactory", "com.sun.xml.internal.messaging.saaj.soap.ver1_2.SOAPMessageFactory1_2Impl");

        try {

            //Crea el request, y que sea acorde a la version soap 1.2
            MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
            //Crea el esqueleto de un mensaje SOAP
            SOAPMessage soapRequest = messageFactory.createMessage();

            SOAPPart part = soapRequest.getSOAPPart();

            SOAPEnvelope envelope = part.getEnvelope();

            String serverURI = "http://ekuatia.set.gov.py/sifen/xsd";
            String nameSpace = "xsd";

            envelope.addNamespaceDeclaration(nameSpace, serverURI);
            envelope.removeNamespaceDeclaration("env");
            envelope.setPrefix("soap");

            SOAPHeader header = envelope.getHeader();
            header.setPrefix("soap");

            //Obtiene el cuerpo del mensaje SOAP
            SOAPBody body = envelope.getBody();
            body.setPrefix("soap");

            //Crea la primera etiqueta del cuerpo del mensaje SOAP
            SOAPElement rEnviConsDe = body.addChildElement("rEnviConsDeRequest", nameSpace);

            SOAPElement dId = rEnviConsDe.addChildElement("dId", nameSpace);
            dId.addTextNode("10325");

            SOAPElement dCDC = rEnviConsDe.addChildElement("dCDC", nameSpace);
            dCDC.addTextNode(cdc);

            //Imprime el request SOAP
            //System.out.println("Mensaje SOAP:");
            //soapRequest.writeTo(System.out);
            //System.out.println();
            return soapRequest;

        } catch (SOAPException e) {
            logger.severe("Error en comSifen al crear el mensaje SOAP");
            e.printStackTrace();
            throw e;
        }
    }
    
    public SOAPMessage crearXmlConsultaRUC(String ruc) throws SOAPException, IOException {
        System.setProperty("javax.xml.soap.MessageFactory", "com.sun.xml.internal.messaging.saaj.soap.ver1_2.SOAPMessageFactory1_2Impl");

        try {

            //Crea el request, y que sea acorde a la version soap 1.2
            MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
            //Crea el esqueleto de un mensaje SOAP
            SOAPMessage soapRequest = messageFactory.createMessage();

            SOAPPart part = soapRequest.getSOAPPart();

            SOAPEnvelope envelope = part.getEnvelope();

            String serverURI = "http://ekuatia.set.gov.py/sifen/xsd";
            String nameSpace = "xsd";

            envelope.addNamespaceDeclaration(nameSpace, serverURI);
            envelope.removeNamespaceDeclaration("env");
            envelope.setPrefix("soap");

            SOAPHeader header = envelope.getHeader();
            header.setPrefix("soap");

            //Obtiene el cuerpo del mensaje SOAP
            SOAPBody body = envelope.getBody();
            body.setPrefix("soap");

            //Crea la primera etiqueta del cuerpo del mensaje SOAP
            SOAPElement rEnviConsRUC = body.addChildElement("rEnviConsRUC", nameSpace);

            SOAPElement dId = rEnviConsRUC.addChildElement("dId", nameSpace);
            dId.addTextNode("1");

            SOAPElement drucCons = rEnviConsRUC.addChildElement("dRUCCons", nameSpace);
            drucCons.addTextNode(ruc);

            //Imprime el request SOAP
            System.out.println("Mensaje SOAP:");
            soapRequest.writeTo(System.out);
            System.out.println();
            return soapRequest;

        } catch (SOAPException e) {
            logger.severe("Error en comunicaSifen al crear el mensaje SOAP");
            e.printStackTrace();
            throw e;
        }
    }
}
