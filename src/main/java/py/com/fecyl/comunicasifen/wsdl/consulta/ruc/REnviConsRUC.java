
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import java.math.BigInteger;
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
 *         &lt;element name="dId" type="{http://ekuatia.set.gov.py/sifen/xsd}dIdType"/>
 *         &lt;element name="dRUCCons" type="{http://ekuatia.set.gov.py/sifen/xsd}tRuc"/>
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
    "dId",
    "drucCons"
})
@XmlRootElement(name = "rEnviConsRUC")
public class REnviConsRUC {

    @XmlElement(required = true)
    protected BigInteger dId;
    @XmlElement(name = "dRUCCons", required = true)
    protected String drucCons;

    /**
     * Obtiene el valor de la propiedad dId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDId() {
        return dId;
    }

    /**
     * Define el valor de la propiedad dId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDId(BigInteger value) {
        this.dId = value;
    }

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

}
