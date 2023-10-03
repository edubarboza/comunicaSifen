
package py.com.fecyl.comunicasifen.wsdl.evento;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Grupo de resultado de procesamiento
 *
 *
 * <p>Java class for tgResProcEVe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tgResProcEVe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dEstRes" type="{http://ekuatia.set.gov.py/sifen/xsd}tdEstRes"/>
 *         &lt;element name="dProtAut" type="{http://ekuatia.set.gov.py/sifen/xsd}tdProtAut" minOccurs="0"/>
 *         &lt;element name="id" type="{http://ekuatia.set.gov.py/sifen/xsd}tid"/>
 *         &lt;element name="gResProc" type="{http://ekuatia.set.gov.py/sifen/xsd}tgResProc" maxOccurs="100"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tgResProcEVe", namespace = "http://ekuatia.set.gov.py/sifen/xsd", propOrder = {
        "dEstRes",
        "dProtAut",
        "id",
        "gResProc"
})
public class TgResProcEVe {

    @XmlElement(required = true)
    protected String dEstRes;
    protected Long dProtAut;
    @XmlSchemaType(name = "integer")
    protected long id;
    @XmlElement(required = true)
    protected List<TgResProc> gResProc;

    /**
     * Gets the value of the dEstRes property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDEstRes() {
        return dEstRes;
    }

    /**
     * Sets the value of the dEstRes property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDEstRes(String value) {
        this.dEstRes = value;
    }

    /**
     * Gets the value of the dProtAut property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getDProtAut() {
        return dProtAut;
    }

    /**
     * Sets the value of the dProtAut property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDProtAut(Long value) {
        this.dProtAut = value;
    }

    /**
     * Gets the value of the id property.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the gResProc property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gResProc property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGResProc().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TgResProc }
     */
    public List<TgResProc> getGResProc() {
        if (gResProc == null) {
            gResProc = new ArrayList<TgResProc>();
        }
        return this.gResProc;
    }

}
