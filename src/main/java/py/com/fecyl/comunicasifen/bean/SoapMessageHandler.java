/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.fecyl.comunicasifen.bean;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.LogicalMessage;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 *
 * @author Fernando Invernizzi <fernando.invernizzi@konecta.com.py>
 */
public class SoapMessageHandler implements LogicalHandler<LogicalMessageContext> {

    final Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public boolean handleMessage(LogicalMessageContext messageContext) {
        dumpSOAPMessage(messageContext);

        return true;
    }

    @Override
    public boolean handleFault(LogicalMessageContext messageContext) {
        return true;
    }

    @Override
    public void close(MessageContext context) {
    }

    private void dumpSOAPMessage(LogicalMessageContext smc) {
        LogicalMessage msg = smc.getMessage();

        Boolean outboundProperty = (Boolean) smc.get("javax.xml.ws.handler.message.outbound");
        String endpointProperty = (String) smc.get("javax.xml.ws.service.endpoint.address");
        try {
            TransformerFactory tfactory = TransformerFactory.newInstance();
            Transformer xform = tfactory.newTransformer();
            StringWriter writer = new StringWriter();
            Result result = new StreamResult(writer);
            xform.transform(msg.getPayload(), result);

            String xml = writer.toString();

            String regex, updatedXml;

            regex = "[\\n\\s]+(\\<[^/])";
            updatedXml = xml.replaceAll(regex, "$1");

            regex = "(\\</[a-zA-Z0-9-_\\.:]+\\>)[\\s]+";
            updatedXml = updatedXml.replaceAll(regex, "$1");

            regex = "(/\\>)[\\s]+";
            updatedXml = updatedXml.replaceAll(regex, "$1");

            logger.info("{" +
                    endpointProperty
                            .concat(":")
                            .concat(outboundProperty
                                    ? String.format("Outbound message [%s]", updatedXml)
                                    : String.format("Inbound message [%s]", updatedXml)
                            + "}")
            );
        } catch (Exception e) {
            logger.severe(e.getMessage());
        }
    }
}
