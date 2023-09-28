package py.com.fecyl.comunicasifen.util;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.ejb.Stateless;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@Stateless
public class ServiciosXml {

    public Document stringToDocument(String xmlString) throws ParserConfigurationException, SAXException, IOException {
        //Parser that produces DOM object trees from XML content
        Document doc = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //API to obtain DOM Document instance
        DocumentBuilder builder = null;
        try {
            //Create DocumentBuilder with default configuration
            builder = factory.newDocumentBuilder();

            //Parse the content to Document object
            doc = builder.parse(new InputSource(new StringReader(xmlString)));

        } catch (ParserConfigurationException e) {
            throw new ParserConfigurationException("Error del Parseador al convertir el inputStream a document");
        } catch (SAXException e) {
            throw new SAXException("Error de libreria SAX al convertir el inputStream a document", e);
        } catch (IOException e) {
            throw new IOException("Error de I/O al convertir el inputStream a document", e);
        }
        return doc;
    }

    public String inputStreamToString(InputStream inputStream){
        StringBuilder textBuilder = new StringBuilder();
        try (Reader reader = new BufferedReader(new InputStreamReader
                (inputStream, Charset.forName(StandardCharsets.UTF_8.name())))) {
            int c = 0;
            while ((c = reader.read()) != -1) {
                textBuilder.append((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return textBuilder.toString();
    }
}
