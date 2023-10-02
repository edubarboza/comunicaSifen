
package py.com.fecyl.comunicasifen.wsdl.de;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
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
 *     &lt;enumeration value="ISC"/>
 *     &lt;enumeration value="Renta"/>
 *     &lt;enumeration value="Ninguno"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "tdDesTImp", namespace = "http://ekuatia.set.gov.py/sifen/xsd")
@XmlEnum
public enum TdDesTImp {


    /**
     * Corresponde al codigo 1 del campo dDesTimp
     */
    IVA("IVA"),

    /**
     * Corresponde al codigo 2 del campo dDesTimp
     */
    ISC("ISC"),

    /**
     * Corresponde al codigo 3 del campo dDesTimp
     */
    @XmlEnumValue("Renta")
    RENTA("Renta"),

    /**
     * Corresponde al codigo 4 del campo dDesTimp
     */
    @XmlEnumValue("Ninguno")
    NINGUNO("Ninguno");
    private final String value;

    TdDesTImp(String v) {
        value = v;
    }

    public static TdDesTImp fromValue(String v) {
        for (TdDesTImp c : TdDesTImp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

}
