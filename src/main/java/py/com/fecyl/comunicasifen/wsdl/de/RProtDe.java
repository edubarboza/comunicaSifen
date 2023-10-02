
package py.com.fecyl.comunicasifen.wsdl.de;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * Respuesta del protocolo de procesamiento del DE
 *
 *
 * <p>Java class for rProtDe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="rProtDe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dFecProc" type="{http://ekuatia.set.gov.py/sifen/xsd}fecUTC"/>
 *         &lt;element name="dDigVal" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dEstRes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dProtAut" type="{http://ekuatia.set.gov.py/sifen/xsd}tdProtAut" minOccurs="0"/>
 *         &lt;element name="gResProc" type="{http://ekuatia.set.gov.py/sifen/xsd}tgResProc" maxOccurs="100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rProtDe", namespace = "http://ekuatia.set.gov.py/sifen/xsd", propOrder = {
        "id",
        "dFecProc",
        "dDigVal",
        "dEstRes",
        "dProtAut",
        "gResProc"
})
public class RProtDe {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dFecProc;
    protected byte[] dDigVal;
    protected String dEstRes;
    protected Long dProtAut;
    protected List<TgResProc> gResProc;

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

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
     * Gets the value of the dDigVal property.
     *
     * @return possible object is
     * byte[]
     */
    public byte[] getDDigVal() {
        return dDigVal;
    }

    /**
     * Sets the value of the dDigVal property.
     *
     * @param value allowed object is
     *              byte[]
     */
    public void setDDigVal(byte[] value) {
        this.dDigVal = value;
    }

    /**
     * Gets the value of the dEstRes property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDEstRes() {
        return dEstRes;
    }

    /**
     * Sets the value of the dEstRes property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDEstRes(String value) {
        this.dEstRes = value;
    }

    /**
     * Gets the value of the dProtAut property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getDProtAut() {
        return dProtAut;
    }

    /**
     * Sets the value of the dProtAut property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDProtAut(Long value) {
        this.dProtAut = value;
    }

    /**
     * Gets the value of the gResProc property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gResProc property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGResProc().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgResProc }
     */
    public List<TgResProc> getGResProc() {
        if (gResProc == null) {
            gResProc = new ArrayList<TgResProc>();
        }
        return this.gResProc;
    }

}
