
package py.com.fecyl.comunicasifen.wsdl.evento;

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
 *         &lt;element name="dEvReg">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gGroupGesEve" type="{http://ekuatia.set.gov.py/sifen/xsd}tgGroupGesEve"/>
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
        "dEvReg"
})
@XmlRootElement(name = "rEnviEventoDe", namespace = "http://ekuatia.set.gov.py/sifen/xsd")
public class REnviEventoDe {

    @XmlElement(namespace = "http://ekuatia.set.gov.py/sifen/xsd", required = true)
    protected BigInteger dId;
    @XmlElement(namespace = "http://ekuatia.set.gov.py/sifen/xsd", required = true)
    protected REnviEventoDe.DEvReg dEvReg;

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
     * Gets the value of the dEvReg property.
     *
     * @return possible object is
     * {@link REnviEventoDe.DEvReg }
     */
    public REnviEventoDe.DEvReg getDEvReg() {
        return dEvReg;
    }

    /**
     * Sets the value of the dEvReg property.
     *
     * @param value allowed object is
     *              {@link REnviEventoDe.DEvReg }
     */
    public void setDEvReg(REnviEventoDe.DEvReg value) {
        this.dEvReg = value;
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
     *         &lt;element name="gGroupGesEve" type="{http://ekuatia.set.gov.py/sifen/xsd}tgGroupGesEve"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "gGroupGesEve"
    })
    public static class DEvReg {

        @XmlElement(namespace = "http://ekuatia.set.gov.py/sifen/xsd", required = true)
        protected TgGroupGesEve gGroupGesEve;

        /**
         * Gets the value of the gGroupGesEve property.
         *
         * @return possible object is
         * {@link TgGroupGesEve }
         */
        public TgGroupGesEve getGGroupGesEve() {
            return gGroupGesEve;
        }

        /**
         * Sets the value of the gGroupGesEve property.
         *
         * @param value allowed object is
         *              {@link TgGroupGesEve }
         */
        public void setGGroupGesEve(TgGroupGesEve value) {
            this.gGroupGesEve = value;
        }

    }

}
