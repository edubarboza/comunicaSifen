
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesTiTran.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesTiTran">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Venta de mercader�a"/>
 *     &lt;enumeration value="Prestaci�n de servicios"/>
 *     &lt;enumeration value="Mixto (Venta de mercader�a y servicios)"/>
 *     &lt;enumeration value="Venta de activo fijo"/>
 *     &lt;enumeration value="Venta de divisas"/>
 *     &lt;enumeration value="Compra de divisas"/>
 *     &lt;enumeration value="Promoci�n o entrega de muestras"/>
 *     &lt;enumeration value="Donaci�n"/>
 *     &lt;enumeration value="Anticipo"/>
 *     &lt;enumeration value="Compra de productos"/>
 *     &lt;enumeration value="Compra de servicios"/>
 *     &lt;enumeration value="Venta de cr�dito fiscal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tdDesTiTran")
@XmlEnum
public enum TdDesTiTran {

    @XmlEnumValue("Venta de mercader\u00eda")
    VENTA_DE_MERCADERIA("Venta de mercader\u00eda"),
    @XmlEnumValue("Prestaci\u00f3n de servicios")
    PRESTACION_DE_SERVICIOS("Prestaci\u00f3n de servicios"),
    @XmlEnumValue("Mixto (Venta de mercader\u00eda y servicios)")
    MIXTO_VENTA_DE_MERCADERIA_Y_SERVICIOS("Mixto (Venta de mercader\u00eda y servicios)"),
    @XmlEnumValue("Venta de activo fijo")
    VENTA_DE_ACTIVO_FIJO("Venta de activo fijo"),
    @XmlEnumValue("Venta de divisas")
    VENTA_DE_DIVISAS("Venta de divisas"),
    @XmlEnumValue("Compra de divisas")
    COMPRA_DE_DIVISAS("Compra de divisas"),
    @XmlEnumValue("Promoci\u00f3n o entrega de muestras")
    PROMOCION_O_ENTREGA_DE_MUESTRAS("Promoci\u00f3n o entrega de muestras"),
    @XmlEnumValue("Donaci\u00f3n")
    DONACION("Donaci\u00f3n"),
    @XmlEnumValue("Anticipo")
    ANTICIPO("Anticipo"),
    @XmlEnumValue("Compra de productos")
    COMPRA_DE_PRODUCTOS("Compra de productos"),
    @XmlEnumValue("Compra de servicios")
    COMPRA_DE_SERVICIOS("Compra de servicios"),
    @XmlEnumValue("Venta de cr\u00e9dito fiscal")
    VENTA_DE_CREDITO_FISCAL("Venta de cr\u00e9dito fiscal");
    private final String value;

    TdDesTiTran(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDesTiTran fromValue(String v) {
        for (TdDesTiTran c: TdDesTiTran.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
