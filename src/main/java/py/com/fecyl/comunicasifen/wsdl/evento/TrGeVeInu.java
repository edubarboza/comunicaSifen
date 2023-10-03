
package py.com.fecyl.comunicasifen.wsdl.evento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Grupo de Datos que identifican al evento de Inutilización de numero de un DE
 *
 *
 * <p>Java class for trGeVeInu complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="trGeVeInu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dNumTim" type="{http://ekuatia.set.gov.py/sifen/xsd}tdNumTim"/>
 *         &lt;element name="dEst" type="{http://ekuatia.set.gov.py/sifen/xsd}tdEst"/>
 *         &lt;element name="dPunExp" type="{http://ekuatia.set.gov.py/sifen/xsd}tdPunExp"/>
 *         &lt;element name="dNumIn" type="{http://ekuatia.set.gov.py/sifen/xsd}tdNumDE"/>
 *         &lt;element name="dNumFin" type="{http://ekuatia.set.gov.py/sifen/xsd}tdNumDE"/>
 *         &lt;element name="iTiDE" type="{http://ekuatia.set.gov.py/sifen/xsd}tiTiDE"/>
 *         &lt;element name="mOtEve" type="{http://ekuatia.set.gov.py/sifen/xsd}tmotEve"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trGeVeInu", namespace = "http://ekuatia.set.gov.py/sifen/xsd", propOrder = {
        "dNumTim",
        "dEst",
        "dPunExp",
        "dNumIn",
        "dNumFin",
        "iTiDE",
        "mOtEve"
})
public class TrGeVeInu {

    @XmlElement(required = true)
    protected String dNumTim;
    @XmlElement(required = true)
    protected String dEst;
    @XmlElement(required = true)
    protected String dPunExp;
    @XmlElement(required = true)
    protected String dNumIn;
    @XmlElement(required = true)
    protected String dNumFin;
    protected short iTiDE;
    @XmlElement(required = true)
    protected String mOtEve;

    /**
     * Gets the value of the dNumTim property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDNumTim() {
        return dNumTim;
    }

    /**
     * Sets the value of the dNumTim property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDNumTim(String value) {
        this.dNumTim = value;
    }

    /**
     * Gets the value of the dEst property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDEst() {
        return dEst;
    }

    /**
     * Sets the value of the dEst property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDEst(String value) {
        this.dEst = value;
    }

    /**
     * Gets the value of the dPunExp property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDPunExp() {
        return dPunExp;
    }

    /**
     * Sets the value of the dPunExp property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDPunExp(String value) {
        this.dPunExp = value;
    }

    /**
     * Gets the value of the dNumIn property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDNumIn() {
        return dNumIn;
    }

    /**
     * Sets the value of the dNumIn property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDNumIn(String value) {
        this.dNumIn = value;
    }

    /**
     * Gets the value of the dNumFin property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDNumFin() {
        return dNumFin;
    }

    /**
     * Sets the value of the dNumFin property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDNumFin(String value) {
        this.dNumFin = value;
    }

    /**
     * Gets the value of the iTiDE property.
     */
    public short getITiDE() {
        return iTiDE;
    }

    /**
     * Sets the value of the iTiDE property.
     */
    public void setITiDE(short value) {
        this.iTiDE = value;
    }

    /**
     * Gets the value of the mOtEve property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMOtEve() {
        return mOtEve;
    }

    /**
     * Sets the value of the mOtEve property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMOtEve(String value) {
        this.mOtEve = value;
    }

}
