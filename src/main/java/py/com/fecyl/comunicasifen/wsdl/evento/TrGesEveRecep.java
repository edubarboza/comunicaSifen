
package py.com.fecyl.comunicasifen.wsdl.evento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trGesEveRecep complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="trGesEveRecep">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rEve" type="{http://ekuatia.set.gov.py/sifen/xsd}trEveRecep"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trGesEveRecep", namespace = "http://ekuatia.set.gov.py/sifen/xsd", propOrder = {
        "rEve"
})
public class TrGesEveRecep {

    @XmlElement(required = true)
    protected TrEveRecep rEve;

    /**
     * Gets the value of the rEve property.
     *
     * @return possible object is
     * {@link TrEveRecep }
     */
    public TrEveRecep getREve() {
        return rEve;
    }

    /**
     * Sets the value of the rEve property.
     *
     * @param value allowed object is
     *              {@link TrEveRecep }
     */
    public void setREve(TrEveRecep value) {
        this.rEve = value;
    }

}
