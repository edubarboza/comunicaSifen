
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesMotEmi.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesMotEmi">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Anulaci�n"/>
 *     &lt;enumeration value="Devoluci�n"/>
 *     &lt;enumeration value="Descuento"/>
 *     &lt;enumeration value="Bonificaci�n"/>
 *     &lt;enumeration value="Cr�dito incobrable"/>
 *     &lt;enumeration value="Recupero de costo"/>
 *     &lt;enumeration value="Recupero de gasto"/>
 *     &lt;enumeration value="Ajuste de precio"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tdDesMotEmi")
@XmlEnum
public enum TdDesMotEmi {

    @XmlEnumValue("Anulaci\u00f3n")
    ANULACION("Anulaci\u00f3n"),
    @XmlEnumValue("Devoluci\u00f3n")
    DEVOLUCION("Devoluci\u00f3n"),
    @XmlEnumValue("Descuento")
    DESCUENTO("Descuento"),
    @XmlEnumValue("Bonificaci\u00f3n")
    BONIFICACION("Bonificaci\u00f3n"),
    @XmlEnumValue("Cr\u00e9dito incobrable")
    CREDITO_INCOBRABLE("Cr\u00e9dito incobrable"),
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

    public String value() {
        return value;
    }

    public static TdDesMotEmi fromValue(String v) {
        for (TdDesMotEmi c: TdDesMotEmi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
