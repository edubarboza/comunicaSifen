
package py.com.fecyl.comunicasifen.wsdl.evento;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.math.BigInteger;
import java.util.List;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 */
@WebService(name = "de-ws-eventos-evento", targetNamespace = "http://ekuatia.set.gov.py/sifen/xsd")
@XmlSeeAlso({
        ObjectFactory.class
})
public interface DeWsEventosEvento {


    /**
     * @param gResProcEVe
     * @param dEvReg
     * @param dFecProc
     * @param dId
     */
    @WebMethod
    @RequestWrapper(localName = "rEnviEventoDe", targetNamespace = "http://ekuatia.set.gov.py/sifen/xsd", className = "evento.REnviEventoDe")
    @ResponseWrapper(localName = "rRetEnviEventoDe", targetNamespace = "http://ekuatia.set.gov.py/sifen/xsd", className = "evento.RRetEnviEventoDe")
    public void rEnviEventoDe(
            @WebParam(name = "dId", targetNamespace = "http://ekuatia.set.gov.py/sifen/xsd")
                    BigInteger dId,
            @WebParam(name = "dEvReg", targetNamespace = "http://ekuatia.set.gov.py/sifen/xsd")
                    py.com.fecyl.comunicasifen.wsdl.evento.REnviEventoDe.DEvReg dEvReg,
            @WebParam(name = "dFecProc", targetNamespace = "http://ekuatia.set.gov.py/sifen/xsd", mode = WebParam.Mode.OUT)
                    Holder<XMLGregorianCalendar> dFecProc,
            @WebParam(name = "gResProcEVe", targetNamespace = "http://ekuatia.set.gov.py/sifen/xsd", mode = WebParam.Mode.OUT)
                    Holder<List<TgResProcEVe>> gResProcEVe);

}
