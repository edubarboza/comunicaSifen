
package py.com.fecyl.comunicasifen.wsdl.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Grupo de resultado de procesamiento
 *
 *
 * <p>Java class for tgResProc complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tgResProc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dCodRes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dMsgRes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgResProc", namespace = "http://ekuatia.set.gov.py/sifen/xsd", propOrder = {
        "dCodRes",
        "dMsgRes"
})
public class TgResProc {

    protected String dCodRes;
    protected String dMsgRes;

    /**
     * Gets the value of the dCodRes property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDCodRes() {
        return dCodRes;
    }

    /**
     * Sets the value of the dCodRes property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDCodRes(String value) {
        this.dCodRes = value;
    }

    /**
     * Gets the value of the dMsgRes property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDMsgRes() {
        return dMsgRes;
    }

    /**
     * Sets the value of the dMsgRes property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDMsgRes(String value) {
        this.dMsgRes = value;
    }

}
