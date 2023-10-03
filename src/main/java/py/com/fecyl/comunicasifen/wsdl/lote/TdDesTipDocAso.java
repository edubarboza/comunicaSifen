
package py.com.fecyl.comunicasifen.wsdl.lote;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdDesTipDocAso.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesTipDocAso">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Electrónico"/>
 *     &lt;enumeration value="Impreso"/>
 *     &lt;minLength value="1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "tdDesTipDocAso")
@XmlEnum
public enum TdDesTipDocAso {

    @XmlEnumValue("Electr\u00f3nico")
    ELECTRÓNICO("Electr\u00f3nico"),
    @XmlEnumValue("Impreso")
    IMPRESO("Impreso");
    private final String value;

    TdDesTipDocAso(String v) {
        value = v;
    }

    public static TdDesTipDocAso fromValue(String v) {
        for (TdDesTipDocAso c : TdDesTipDocAso.values()) {
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
