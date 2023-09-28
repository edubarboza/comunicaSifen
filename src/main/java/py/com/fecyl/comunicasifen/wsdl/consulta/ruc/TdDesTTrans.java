
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesTTrans.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesTTrans">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Propio"/>
 *     &lt;enumeration value="Tercero"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tdDesTTrans")
@XmlEnum
public enum TdDesTTrans {

    @XmlEnumValue("Propio")
    PROPIO("Propio"),
    @XmlEnumValue("Tercero")
    TERCERO("Tercero");
    private final String value;

    TdDesTTrans(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDesTTrans fromValue(String v) {
        for (TdDesTTrans c: TdDesTTrans.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
