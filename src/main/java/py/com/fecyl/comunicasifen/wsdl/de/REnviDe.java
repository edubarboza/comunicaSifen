
package py.com.fecyl.comunicasifen.wsdl.de;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
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
 *         &lt;element name="dId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xDE">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='skip' namespace='http://ekuatia.set.gov.py/sifen/xsd'/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "dId",
        "xde"
})
@XmlRootElement(name = "rEnviDe", namespace = "http://ekuatia.set.gov.py/sifen/xsd")
public class REnviDe {

    @XmlElement(namespace = "http://ekuatia.set.gov.py/sifen/xsd", required = true)
    protected BigInteger dId;
    @XmlElement(name = "xDE", namespace = "http://ekuatia.set.gov.py/sifen/xsd", required = true)
    protected REnviDe.XDE xde;

    /**
     * Gets the value of the dId property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDId() {
        return dId;
    }

    /**
     * Sets the value of the dId property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDId(BigInteger value) {
        this.dId = value;
    }

    /**
     * Gets the value of the xde property.
     *
     * @return possible object is
     * {@link REnviDe.XDE }
     */
    public REnviDe.XDE getXDE() {
        return xde;
    }

    /**
     * Sets the value of the xde property.
     *
     * @param value allowed object is
     *              {@link REnviDe.XDE }
     */
    public void setXDE(REnviDe.XDE value) {
        this.xde = value;
    }


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
     *         &lt;any processContents='skip' namespace='http://ekuatia.set.gov.py/sifen/xsd'/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "any"
    })
    public static class XDE {

        @XmlAnyElement
        protected Element any;

        /**
         * Gets the value of the any property.
         *
         * @return possible object is
         * {@link Element }
         */
        public Element getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         *
         * @param value allowed object is
         *              {@link Element }
         */
        public void setAny(Element value) {
            this.any = value;
        }

    }

}
