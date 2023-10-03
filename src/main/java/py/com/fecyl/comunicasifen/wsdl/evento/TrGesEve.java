
package py.com.fecyl.comunicasifen.wsdl.evento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trGesEve complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="trGesEve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rEve" type="{http://ekuatia.set.gov.py/sifen/xsd}trEve"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trGesEve", namespace = "http://ekuatia.set.gov.py/sifen/xsd", propOrder = {
        "rEve",
        "signature"
})
public class TrGesEve {

    @XmlElement(required = true)
    protected TrEve rEve;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the rEve property.
     *
     * @return possible object is
     * {@link TrEve }
     */
    public TrEve getREve() {
        return rEve;
    }

    /**
     * Sets the value of the rEve property.
     *
     * @param value allowed object is
     *              {@link TrEve }
     */
    public void setREve(TrEve value) {
        this.rEve = value;
    }

    /**
     * Firma Digital del DE
     *
     * @return possible object is
     * {@link SignatureType }
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     *
     * @param value allowed object is
     *              {@link SignatureType }
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

}
