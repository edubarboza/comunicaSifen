
package py.com.fecyl.comunicasifen.wsdl.lote;

import javax.activation.DataHandler;
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
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xDE" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
@XmlRootElement(name = "rEnvioLote")
public class REnvioLote {

    @XmlElement(required = true)
    protected BigInteger dId;
    @XmlElement(name = "xDE", required = true)
    @XmlMimeType("application/zip")
    protected DataHandler xde;

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
     * {@link DataHandler }
     */
    public DataHandler getXDE() {
        return xde;
    }

    /**
     * Sets the value of the xde property.
     *
     * @param value allowed object is
     *              {@link DataHandler }
     */
    public void setXDE(DataHandler value) {
        this.xde = value;
    }

}
