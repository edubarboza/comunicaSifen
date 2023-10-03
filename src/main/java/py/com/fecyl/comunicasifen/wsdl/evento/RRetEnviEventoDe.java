
package py.com.fecyl.comunicasifen.wsdl.evento;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="dFecProc" type="{http://ekuatia.set.gov.py/sifen/xsd}fecUTC"/>
 *         &lt;element name="gResProcEVe" type="{http://ekuatia.set.gov.py/sifen/xsd}tgResProcEVe" maxOccurs="15"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "dFecProc",
        "gResProcEVe"
})
@XmlRootElement(name = "rRetEnviEventoDe", namespace = "http://ekuatia.set.gov.py/sifen/xsd")
public class RRetEnviEventoDe {

    @XmlElement(namespace = "http://ekuatia.set.gov.py/sifen/xsd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dFecProc;
    @XmlElement(namespace = "http://ekuatia.set.gov.py/sifen/xsd", required = true)
    protected List<TgResProcEVe> gResProcEVe;

    /**
     * Gets the value of the dFecProc property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDFecProc() {
        return dFecProc;
    }

    /**
     * Sets the value of the dFecProc property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setDFecProc(XMLGregorianCalendar value) {
        this.dFecProc = value;
    }

    /**
     * Gets the value of the gResProcEVe property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gResProcEVe property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGResProcEVe().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgResProcEVe }
     */
    public List<TgResProcEVe> getGResProcEVe() {
        if (gResProcEVe == null) {
            gResProcEVe = new ArrayList<TgResProcEVe>();
        }
        return this.gResProcEVe;
    }

}
