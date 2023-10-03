
package py.com.fecyl.comunicasifen.wsdl.evento;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;


/**
 * Grupo de Datos que identifican al evento receptor Conformidad
 *
 *
 * <p>Java class for trGeVeConf complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="trGeVeConf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://ekuatia.set.gov.py/sifen/xsd}tId"/>
 *         &lt;element name="iTipConf" type="{http://ekuatia.set.gov.py/sifen/xsd}tiTipEve"/>
 *         &lt;element name="dFecRecep" type="{http://ekuatia.set.gov.py/sifen/xsd}fecHhmmss" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trGeVeConf", namespace = "http://ekuatia.set.gov.py/sifen/xsd", propOrder = {
        "id",
        "iTipConf",
        "dFecRecep"
})
public class TrGeVeConf {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger iTipConf;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dFecRecep;

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
     * Gets the value of the iTipConf property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getITipConf() {
        return iTipConf;
    }

    /**
     * Sets the value of the iTipConf property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setITipConf(BigInteger value) {
        this.iTipConf = value;
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

}
