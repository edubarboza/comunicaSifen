
package py.com.fecyl.comunicasifen.wsdl.evento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Grupo de Datos que identifican al evento de Cancelación del DTE
 *
 *
 * <p>Java class for trGeVeCan complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="trGeVeCan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://ekuatia.set.gov.py/sifen/xsd}tId"/>
 *         &lt;element name="mOtEve" type="{http://ekuatia.set.gov.py/sifen/xsd}tmotEve"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trGeVeCan", namespace = "http://ekuatia.set.gov.py/sifen/xsd", propOrder = {
        "id",
        "mOtEve"
})
public class TrGeVeCan {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(required = true)
    protected String mOtEve;

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
     * Gets the value of the mOtEve property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMOtEve() {
        return mOtEve;
    }

    /**
     * Sets the value of the mOtEve property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMOtEve(String value) {
        this.mOtEve = value;
    }

}
