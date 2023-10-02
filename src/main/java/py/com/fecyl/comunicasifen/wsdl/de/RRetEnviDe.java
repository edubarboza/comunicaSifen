
package py.com.fecyl.comunicasifen.wsdl.de;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="rProtDe" type="{http://ekuatia.set.gov.py/sifen/xsd}rProtDe"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "rProtDe"
})
@XmlRootElement(name = "rRetEnviDe", namespace = "http://ekuatia.set.gov.py/sifen/xsd")
public class RRetEnviDe {

    @XmlElement(namespace = "http://ekuatia.set.gov.py/sifen/xsd", required = true)
    protected RProtDe rProtDe;

    /**
     * Gets the value of the rProtDe property.
     *
     * @return possible object is
     * {@link RProtDe }
     */
    public RProtDe getRProtDe() {
        return rProtDe;
    }

    /**
     * Sets the value of the rProtDe property.
     *
     * @param value allowed object is
     *              {@link RProtDe }
     */
    public void setRProtDe(RProtDe value) {
        this.rProtDe = value;
    }

}
