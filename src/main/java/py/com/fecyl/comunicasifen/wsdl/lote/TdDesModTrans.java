
package py.com.fecyl.comunicasifen.wsdl.lote;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdDesModTrans.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesModTrans">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Terrestre"/>
 *     &lt;enumeration value="Fluvial"/>
 *     &lt;enumeration value="Aéreo"/>
 *     &lt;enumeration value="Multimodal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "tdDesModTrans")
@XmlEnum
public enum TdDesModTrans {

    @XmlEnumValue("Terrestre")
    TERRESTRE("Terrestre"),
    @XmlEnumValue("Fluvial")
    FLUVIAL("Fluvial"),
    @XmlEnumValue("A\u00e9reo")
    AÉREO("A\u00e9reo"),
    @XmlEnumValue("Multimodal")
    MULTIMODAL("Multimodal");
    private final String value;

    TdDesModTrans(String v) {
        value = v;
    }

    public static TdDesModTrans fromValue(String v) {
        for (TdDesModTrans c : TdDesModTrans.values()) {
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
