
package py.com.fecyl.comunicasifen.wsdl.lote;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dFecProc" type="{http://ekuatia.set.gov.py/sifen/xsd}fecUTC" minOccurs="0"/>
 *         &lt;element name="dCodRes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dMsgRes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dProtConsLote" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dTpoProces" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "dFecProc",
        "dCodRes",
        "dMsgRes",
        "dProtConsLote",
        "dTpoProces"
})
@XmlRootElement(name = "rResEnviLoteDe")
public class RResEnviLoteDe {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dFecProc;
    protected String dCodRes;
    protected String dMsgRes;
    protected Long dProtConsLote;
    protected BigInteger dTpoProces;

    /**
     * Gets the value of the dFecProc property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDFecProc() {
        return dFecProc;
    }

    /**
     * Sets the value of the dFecProc property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setDFecProc(XMLGregorianCalendar value) {
        this.dFecProc = value;
    }

    /**
     * Gets the value of the dCodRes property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDCodRes() {
        return dCodRes;
    }

    /**
     * Sets the value of the dCodRes property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDCodRes(String value) {
        this.dCodRes = value;
    }

    /**
     * Gets the value of the dMsgRes property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDMsgRes() {
        return dMsgRes;
    }

    /**
     * Sets the value of the dMsgRes property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDMsgRes(String value) {
        this.dMsgRes = value;
    }

    /**
     * Gets the value of the dProtConsLote property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getDProtConsLote() {
        return dProtConsLote;
    }

    /**
     * Sets the value of the dProtConsLote property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDProtConsLote(Long value) {
        this.dProtConsLote = value;
    }

    /**
     * Gets the value of the dTpoProces property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDTpoProces() {
        return dTpoProces;
    }

    /**
     * Sets the value of the dTpoProces property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDTpoProces(BigInteger value) {
        this.dTpoProces = value;
    }

}
