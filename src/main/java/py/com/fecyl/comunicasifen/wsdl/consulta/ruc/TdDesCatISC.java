
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesCatISC.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesCatISC">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SECCION I-(Cigarrillos,Tabacos,Esencias y Otros derivados del Tabaco)"/>
 *     &lt;enumeration value="SECCION II - (Bebidas con y sin alcohol)"/>
 *     &lt;enumeration value="SECCION III - (Alcoholes y Derivados del alcohol)"/>
 *     &lt;enumeration value="SECCION IV - (Combustibles)"/>
 *     &lt;enumeration value="SECCION V - (Art�culos considerados de lujo)"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tdDesCatISC")
@XmlEnum
public enum TdDesCatISC {

    @XmlEnumValue("SECCION I-(Cigarrillos,Tabacos,Esencias y Otros derivados del Tabaco)")
    SECCION_I_CIGARRILLOS_TABACOS_ESENCIAS_Y_OTROS_DERIVADOS_DEL_TABACO("SECCION I-(Cigarrillos,Tabacos,Esencias y Otros derivados del Tabaco)"),
    @XmlEnumValue("SECCION II - (Bebidas con y sin alcohol)")
    SECCION_II_BEBIDAS_CON_Y_SIN_ALCOHOL("SECCION II - (Bebidas con y sin alcohol)"),
    @XmlEnumValue("SECCION III - (Alcoholes y Derivados del alcohol)")
    SECCION_III_ALCOHOLES_Y_DERIVADOS_DEL_ALCOHOL("SECCION III - (Alcoholes y Derivados del alcohol)"),
    @XmlEnumValue("SECCION IV - (Combustibles)")
    SECCION_IV_COMBUSTIBLES("SECCION IV - (Combustibles)"),
    @XmlEnumValue("SECCION V - (Art\u00edculos considerados de lujo)")
    SECCION_V_ARTICULOS_CONSIDERADOS_DE_LUJO("SECCION V - (Art\u00edculos considerados de lujo)");
    private final String value;

    TdDesCatISC(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDesCatISC fromValue(String v) {
        for (TdDesCatISC c: TdDesCatISC.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
