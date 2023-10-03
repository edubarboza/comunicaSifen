
package py.com.fecyl.comunicasifen.wsdl.lote;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdDesTImp.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesTImp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IVA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "tdDesTImp")
@XmlEnum
public enum TdDesTImp {


    /**
     * Corresponde al codigo 1 del campo dDesTimp
     */
    IVA;

    public static TdDesTImp fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }

}
