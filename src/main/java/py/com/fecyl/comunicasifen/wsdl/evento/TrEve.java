
package py.com.fecyl.comunicasifen.wsdl.evento;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;


/**
 * <p>Java class for trEve complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="trEve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dFecFirma" type="{http://ekuatia.set.gov.py/sifen/xsd}fecHhmmss"/>
 *         &lt;element name="dVerFor" type="{http://ekuatia.set.gov.py/sifen/xsd}tVerFor"/>
 *         &lt;element name="gGroupTiEvt" type="{http://ekuatia.set.gov.py/sifen/xsd}tgGroupEvt"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://ekuatia.set.gov.py/sifen/xsd}tdIdEve" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trEve", namespace = "http://ekuatia.set.gov.py/sifen/xsd", propOrder = {
        "dFecFirma",
        "dVerFor",
        "gGroupTiEvt"
})
public class TrEve {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dFecFirma;
    @XmlElement(required = true)
    protected BigInteger dVerFor;
    @XmlElement(required = true)
    protected TgGroupEvt gGroupTiEvt;
    @XmlAttribute(name = "Id", required = true)
    protected long id;

    /**
     * Gets the value of the dFecFirma property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDFecFirma() {
        return dFecFirma;
    }

    /**
     * Sets the value of the dFecFirma property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setDFecFirma(XMLGregorianCalendar value) {
        this.dFecFirma = value;
    }

    /**
     * Gets the value of the dVerFor property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDVerFor() {
        return dVerFor;
    }

    /**
     * Sets the value of the dVerFor property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDVerFor(BigInteger value) {
        this.dVerFor = value;
    }

    /**
     * Gets the value of the gGroupTiEvt property.
     *
     * @return possible object is
     * {@link TgGroupEvt }
     */
    public TgGroupEvt getGGroupTiEvt() {
        return gGroupTiEvt;
    }

    /**
     * Sets the value of the gGroupTiEvt property.
     *
     * @param value allowed object is
     *              {@link TgGroupEvt }
     */
    public void setGGroupTiEvt(TgGroupEvt value) {
        this.gGroupTiEvt = value;
    }

    /**
     * Gets the value of the id property.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     */
    public void setId(long value) {
        this.id = value;
    }

}
