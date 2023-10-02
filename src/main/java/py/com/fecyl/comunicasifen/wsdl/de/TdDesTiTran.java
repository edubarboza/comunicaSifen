
package py.com.fecyl.comunicasifen.wsdl.de;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdDesTiTran.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesTiTran">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Venta de mercadería"/>
 *     &lt;enumeration value="Prestación de servicios"/>
 *     &lt;enumeration value="Mixto (Venta de mercadería y servicios)"/>
 *     &lt;enumeration value="Venta de activo fijo"/>
 *     &lt;enumeration value="Venta de divisas"/>
 *     &lt;enumeration value="Compra de divisas"/>
 *     &lt;enumeration value="Promociones o entrega de muestras"/>
 *     &lt;enumeration value="Donación"/>
 *     &lt;enumeration value="Anticipo"/>
 *     &lt;enumeration value="Compra de productos"/>
 *     &lt;enumeration value="Compra de servicios"/>
 *     &lt;enumeration value="Venta de crédito fiscal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "tdDesTiTran", namespace = "http://ekuatia.set.gov.py/sifen/xsd")
@XmlEnum
public enum TdDesTiTran {

    @XmlEnumValue("Venta de mercader\u00eda")
    VENTA_DE_MERCADERÍA("Venta de mercader\u00eda"),
    @XmlEnumValue("Prestaci\u00f3n de servicios")
    PRESTACIÓN_DE_SERVICIOS("Prestaci\u00f3n de servicios"),
    @XmlEnumValue("Mixto (Venta de mercader\u00eda y servicios)")
    MIXTO_VENTA_DE_MERCADERÍA_Y_SERVICIOS("Mixto (Venta de mercader\u00eda y servicios)"),
    @XmlEnumValue("Venta de activo fijo")
    VENTA_DE_ACTIVO_FIJO("Venta de activo fijo"),
    @XmlEnumValue("Venta de divisas")
    VENTA_DE_DIVISAS("Venta de divisas"),
    @XmlEnumValue("Compra de divisas")
    COMPRA_DE_DIVISAS("Compra de divisas"),
    @XmlEnumValue("Promociones o entrega de muestras")
    PROMOCIONES_O_ENTREGA_DE_MUESTRAS("Promociones o entrega de muestras"),
    @XmlEnumValue("Donaci\u00f3n")
    DONACIÓN("Donaci\u00f3n"),
    @XmlEnumValue("Anticipo")
    ANTICIPO("Anticipo"),
    @XmlEnumValue("Compra de productos")
    COMPRA_DE_PRODUCTOS("Compra de productos"),
    @XmlEnumValue("Compra de servicios")
    COMPRA_DE_SERVICIOS("Compra de servicios"),
    @XmlEnumValue("Venta de cr\u00e9dito fiscal")
    VENTA_DE_CRÉDITO_FISCAL("Venta de cr\u00e9dito fiscal");
    private final String value;

    TdDesTiTran(String v) {
        value = v;
    }

    public static TdDesTiTran fromValue(String v) {
        for (TdDesTiTran c : TdDesTiTran.values()) {
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
