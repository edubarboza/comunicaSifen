
package py.com.fecyl.comunicasifen.wsdl.lote;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdDesMotEmi.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesMotEmi">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Anulación"/>
 *     &lt;enumeration value="Devolución"/>
 *     &lt;enumeration value="Descuento"/>
 *     &lt;enumeration value="Bonificación"/>
 *     &lt;enumeration value="Crédito incobrable"/>
 *     &lt;enumeration value="Recupero de costo"/>
 *     &lt;enumeration value="Recupero de gasto"/>
 *     &lt;enumeration value="Ajuste de precio"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "tdDesMotEmi")
@XmlEnum
public enum TdDesMotEmi {

    @XmlEnumValue("Anulaci\u00f3n")
    ANULACIÓN("Anulaci\u00f3n"),
    @XmlEnumValue("Devoluci\u00f3n")
    DEVOLUCIÓN("Devoluci\u00f3n"),
    @XmlEnumValue("Descuento")
    DESCUENTO("Descuento"),
    @XmlEnumValue("Bonificaci\u00f3n")
    BONIFICACIÓN("Bonificaci\u00f3n"),
    @XmlEnumValue("Cr\u00e9dito incobrable")
    CRÉDITO_INCOBRABLE("Cr\u00e9dito incobrable"),
    @XmlEnumValue("Recupero de costo")
    RECUPERO_DE_COSTO("Recupero de costo"),
    @XmlEnumValue("Recupero de gasto")
    RECUPERO_DE_GASTO("Recupero de gasto"),
    @XmlEnumValue("Ajuste de precio")
    AJUSTE_DE_PRECIO("Ajuste de precio");
    private final String value;

    TdDesMotEmi(String v) {
        value = v;
    }

    public static TdDesMotEmi fromValue(String v) {
        for (TdDesMotEmi c : TdDesMotEmi.values()) {
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
