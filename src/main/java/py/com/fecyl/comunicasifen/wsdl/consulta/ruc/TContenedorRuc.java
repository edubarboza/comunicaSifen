
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Respuesta del protocolo de procesamiento del DE
 * 					
 * 
 * <p>Clase Java para tContenedorRuc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tContenedorRuc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dRUCCons" type="{http://ekuatia.set.gov.py/sifen/xsd}tRuc"/>
 *         &lt;element name="dRazCons">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="250"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dCodEstCons">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dDesEstCons">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dRUCFactElec">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tContenedorRuc", propOrder = {
    "drucCons",
    "dRazCons",
    "dCodEstCons",
    "dDesEstCons",
    "drucFactElec"
})
public class TContenedorRuc {

    @XmlElement(name = "dRUCCons", required = true)
    protected String drucCons;
    @XmlElement(required = true)
    protected String dRazCons;
    @XmlElement(required = true)
    protected String dCodEstCons;
    @XmlElement(required = true)
    protected String dDesEstCons;
    @XmlElement(name = "dRUCFactElec", required = true)
    protected String drucFactElec;

    /**
     * Obtiene el valor de la propiedad drucCons.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRUCCons() {
        return drucCons;
    }

    /**
     * Define el valor de la propiedad drucCons.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRUCCons(String value) {
        this.drucCons = value;
    }

    /**
     * Obtiene el valor de la propiedad dRazCons.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRazCons() {
        return dRazCons;
    }

    /**
     * Define el valor de la propiedad dRazCons.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRazCons(String value) {
        this.dRazCons = value;
    }

    /**
     * Obtiene el valor de la propiedad dCodEstCons.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCodEstCons() {
        return dCodEstCons;
    }

    /**
     * Define el valor de la propiedad dCodEstCons.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCodEstCons(String value) {
        this.dCodEstCons = value;
    }

    /**
     * Obtiene el valor de la propiedad dDesEstCons.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDesEstCons() {
        return dDesEstCons;
    }

    /**
     * Define el valor de la propiedad dDesEstCons.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDesEstCons(String value) {
        this.dDesEstCons = value;
    }

    /**
     * Obtiene el valor de la propiedad drucFactElec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRUCFactElec() {
        return drucFactElec;
    }

    /**
     * Define el valor de la propiedad drucFactElec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRUCFactElec(String value) {
        this.drucFactElec = value;
    }

}
