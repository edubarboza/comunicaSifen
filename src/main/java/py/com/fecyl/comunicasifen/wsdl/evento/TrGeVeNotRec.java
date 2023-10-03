
package py.com.fecyl.comunicasifen.wsdl.evento;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;


/**
 * Grupo de Datos que identifican al evento receptor Notificación - Recepción de un DE/DTE
 *
 *
 * <p>Java class for trGeVeNotRec complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="trGeVeNotRec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://ekuatia.set.gov.py/sifen/xsd}tId"/>
 *         &lt;element name="dFecEmi" type="{http://ekuatia.set.gov.py/sifen/xsd}fecHhmmss"/>
 *         &lt;element name="dFecRecep" type="{http://ekuatia.set.gov.py/sifen/xsd}fecHhmmss"/>
 *         &lt;element name="iTipRec" type="{http://ekuatia.set.gov.py/sifen/xsd}tiTipEve"/>
 *         &lt;element name="dNomRec" type="{http://ekuatia.set.gov.py/sifen/xsd}tdNomRec"/>
 *         &lt;element name="dRucRec" type="{http://ekuatia.set.gov.py/sifen/xsd}tRuc" minOccurs="0"/>
 *         &lt;element name="dDVRec" type="{http://ekuatia.set.gov.py/sifen/xsd}tDVer" minOccurs="0"/>
 *         &lt;element name="dTipIDRec" type="{http://ekuatia.set.gov.py/sifen/xsd}tiTipDoc" minOccurs="0"/>
 *         &lt;element name="dNumID" type="{http://ekuatia.set.gov.py/sifen/xsd}tdNumDocId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trGeVeNotRec", namespace = "http://ekuatia.set.gov.py/sifen/xsd", propOrder = {
        "id",
        "dFecEmi",
        "dFecRecep",
        "iTipRec",
        "dNomRec",
        "dRucRec",
        "ddvRec",
        "dTipIDRec",
        "dNumID"
})
public class TrGeVeNotRec {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dFecEmi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dFecRecep;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger iTipRec;
    @XmlElement(required = true)
    protected String dNomRec;
    protected String dRucRec;
    @XmlElement(name = "dDVRec")
    protected BigInteger ddvRec;
    protected BigInteger dTipIDRec;
    protected String dNumID;

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
     * Gets the value of the dFecEmi property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDFecEmi() {
        return dFecEmi;
    }

    /**
     * Sets the value of the dFecEmi property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setDFecEmi(XMLGregorianCalendar value) {
        this.dFecEmi = value;
    }

    /**
     * Gets the value of the dFecRecep property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDFecRecep() {
        return dFecRecep;
    }

    /**
     * Sets the value of the dFecRecep property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setDFecRecep(XMLGregorianCalendar value) {
        this.dFecRecep = value;
    }

    /**
     * Gets the value of the iTipRec property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getITipRec() {
        return iTipRec;
    }

    /**
     * Sets the value of the iTipRec property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setITipRec(BigInteger value) {
        this.iTipRec = value;
    }

    /**
     * Gets the value of the dNomRec property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDNomRec() {
        return dNomRec;
    }

    /**
     * Sets the value of the dNomRec property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDNomRec(String value) {
        this.dNomRec = value;
    }

    /**
     * Gets the value of the dRucRec property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDRucRec() {
        return dRucRec;
    }

    /**
     * Sets the value of the dRucRec property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDRucRec(String value) {
        this.dRucRec = value;
    }

    /**
     * Gets the value of the ddvRec property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDDVRec() {
        return ddvRec;
    }

    /**
     * Sets the value of the ddvRec property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDDVRec(BigInteger value) {
        this.ddvRec = value;
    }

    /**
     * Gets the value of the dTipIDRec property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDTipIDRec() {
        return dTipIDRec;
    }

    /**
     * Sets the value of the dTipIDRec property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDTipIDRec(BigInteger value) {
        this.dTipIDRec = value;
    }

    /**
     * Gets the value of the dNumID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDNumID() {
        return dNumID;
    }

    /**
     * Sets the value of the dNumID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDNumID(String value) {
        this.dNumID = value;
    }

}
