
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDCondCred.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDCondCred">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Plazo"/>
 *     &lt;enumeration value="Cuota"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tdDCondCred")
@XmlEnum
public enum TdDCondCred {

    @XmlEnumValue("Plazo")
    PLAZO("Plazo"),
    @XmlEnumValue("Cuota")
    CUOTA("Cuota");
    private final String value;

    TdDCondCred(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDCondCred fromValue(String v) {
        for (TdDCondCred c: TdDCondCred.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
