
package py.com.fecyl.comunicasifen.wsdl.evento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Grupo del evento Receptores
 *
 *
 * <p>Java class for tgGroupEvtRecep complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tgGroupEvtRecep">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="rGeVeNotRec" type="{http://ekuatia.set.gov.py/sifen/xsd}trGeVeNotRec"/>
 *         &lt;element name="rGeVeConf" type="{http://ekuatia.set.gov.py/sifen/xsd}trGeVeConf"/>
 *         &lt;element name="rGeVeDisconf" type="{http://ekuatia.set.gov.py/sifen/xsd}trGeVeDisconf"/>
 *         &lt;element name="rGeVeDescon" type="{http://ekuatia.set.gov.py/sifen/xsd}trGeVeDescon"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgGroupEvtRecep", namespace = "http://ekuatia.set.gov.py/sifen/xsd", propOrder = {
        "rGeVeNotRec",
        "rGeVeConf",
        "rGeVeDisconf",
        "rGeVeDescon"
})
public class TgGroupEvtRecep {

    protected TrGeVeNotRec rGeVeNotRec;
    protected TrGeVeConf rGeVeConf;
    protected TrGeVeDisconf rGeVeDisconf;
    protected TrGeVeDescon rGeVeDescon;

    /**
     * Gets the value of the rGeVeNotRec property.
     *
     * @return possible object is
     * {@link TrGeVeNotRec }
     */
    public TrGeVeNotRec getRGeVeNotRec() {
        return rGeVeNotRec;
    }

    /**
     * Sets the value of the rGeVeNotRec property.
     *
     * @param value allowed object is
     *              {@link TrGeVeNotRec }
     */
    public void setRGeVeNotRec(TrGeVeNotRec value) {
        this.rGeVeNotRec = value;
    }

    /**
     * Gets the value of the rGeVeConf property.
     *
     * @return possible object is
     * {@link TrGeVeConf }
     */
    public TrGeVeConf getRGeVeConf() {
        return rGeVeConf;
    }

    /**
     * Sets the value of the rGeVeConf property.
     *
     * @param value allowed object is
     *              {@link TrGeVeConf }
     */
    public void setRGeVeConf(TrGeVeConf value) {
        this.rGeVeConf = value;
    }

    /**
     * Gets the value of the rGeVeDisconf property.
     *
     * @return possible object is
     * {@link TrGeVeDisconf }
     */
    public TrGeVeDisconf getRGeVeDisconf() {
        return rGeVeDisconf;
    }

    /**
     * Sets the value of the rGeVeDisconf property.
     *
     * @param value allowed object is
     *              {@link TrGeVeDisconf }
     */
    public void setRGeVeDisconf(TrGeVeDisconf value) {
        this.rGeVeDisconf = value;
    }

    /**
     * Gets the value of the rGeVeDescon property.
     *
     * @return possible object is
     * {@link TrGeVeDescon }
     */
    public TrGeVeDescon getRGeVeDescon() {
        return rGeVeDescon;
    }

    /**
     * Sets the value of the rGeVeDescon property.
     *
     * @param value allowed object is
     *              {@link TrGeVeDescon }
     */
    public void setRGeVeDescon(TrGeVeDescon value) {
        this.rGeVeDescon = value;
    }

}
