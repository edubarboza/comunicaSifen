
package py.com.fecyl.comunicasifen.wsdl.lote;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdDesAfecIVA.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesAfecIVA">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Gravado IVA"/>
 *     &lt;enumeration value="Exonerado (Art. 83- Ley 125/91)"/>
 *     &lt;enumeration value="Exento"/>
 *     &lt;enumeration value="Gravado parcial (Grav- Exento)"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "tdDesAfecIVA")
@XmlEnum
public enum TdDesAfecIVA {

    @XmlEnumValue("Gravado IVA")
    GRAVADO_IVA("Gravado IVA"),
    @XmlEnumValue("Exonerado (Art. 83- Ley 125/91)")
    EXONERADO_ART_83_LEY_125_91("Exonerado (Art. 83- Ley 125/91)"),
    @XmlEnumValue("Exento")
    EXENTO("Exento"),
    @XmlEnumValue("Gravado parcial (Grav- Exento)")
    GRAVADO_PARCIAL_GRAV_EXENTO("Gravado parcial (Grav- Exento)");
    private final String value;

    TdDesAfecIVA(String v) {
        value = v;
    }

    public static TdDesAfecIVA fromValue(String v) {
        for (TdDesAfecIVA c : TdDesAfecIVA.values()) {
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
