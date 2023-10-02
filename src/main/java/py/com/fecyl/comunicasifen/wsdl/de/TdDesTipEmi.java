
package py.com.fecyl.comunicasifen.wsdl.de;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdDesTipEmi.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesTipEmi">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="6"/>
 *     &lt;maxLength value="12"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Contingencia"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "tdDesTipEmi", namespace = "http://ekuatia.set.gov.py/sifen/xsd")
@XmlEnum
public enum TdDesTipEmi {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Contingencia")
    CONTINGENCIA("Contingencia");
    private final String value;

    TdDesTipEmi(String v) {
        value = v;
    }

    public static TdDesTipEmi fromValue(String v) {
        for (TdDesTipEmi c : TdDesTipEmi.values()) {
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
