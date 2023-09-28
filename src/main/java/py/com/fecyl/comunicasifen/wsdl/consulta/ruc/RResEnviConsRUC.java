
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dCodRes">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dMsgRes">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xContRUC" type="{http://ekuatia.set.gov.py/sifen/xsd}tContenedorRuc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dCodRes",
    "dMsgRes",
    "xContRUC"
})
@XmlRootElement(name = "rResEnviConsRUC")
public class RResEnviConsRUC {

    @XmlElement(required = true)
    protected String dCodRes;
    @XmlElement(required = true)
    protected String dMsgRes;
    protected TContenedorRuc xContRUC;

    /**
     * Obtiene el valor de la propiedad dCodRes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCodRes() {
        return dCodRes;
    }

    /**
     * Define el valor de la propiedad dCodRes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCodRes(String value) {
        this.dCodRes = value;
    }

    /**
     * Obtiene el valor de la propiedad dMsgRes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDMsgRes() {
        return dMsgRes;
    }

    /**
     * Define el valor de la propiedad dMsgRes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDMsgRes(String value) {
        this.dMsgRes = value;
    }

    /**
     * Obtiene el valor de la propiedad xContRUC.
     * 
     * @return
     *     possible object is
     *     {@link TContenedorRuc }
     *     
     */
    public TContenedorRuc getXContRUC() {
        return xContRUC;
    }

    /**
     * Define el valor de la propiedad xContRUC.
     * 
     * @param value
     *     allowed object is
     *     {@link TContenedorRuc }
     *     
     */
    public void setXContRUC(TContenedorRuc value) {
        this.xContRUC = value;
    }

}
