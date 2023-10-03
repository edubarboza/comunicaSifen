
package py.com.fecyl.comunicasifen.wsdl.lote;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdDCondOpe.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDCondOpe">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Contado"/>
 *     &lt;enumeration value="Crédito"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "tdDCondOpe")
@XmlEnum
public enum TdDCondOpe {

    @XmlEnumValue("Contado")
    CONTADO("Contado"),
    @XmlEnumValue("Cr\u00e9dito")
    CRÉDITO("Cr\u00e9dito");
    private final String value;

    TdDCondOpe(String v) {
        value = v;
    }

    public static TdDCondOpe fromValue(String v) {
        for (TdDCondOpe c : TdDCondOpe.values()) {
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
