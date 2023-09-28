
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesCondVeh.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesCondVeh">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Acabado"/>
 *     &lt;enumeration value="Semi-acabado"/>
 *     &lt;enumeration value="Inacabado"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tdDesCondVeh")
@XmlEnum
public enum TdDesCondVeh {

    @XmlEnumValue("Acabado")
    ACABADO("Acabado"),
    @XmlEnumValue("Semi-acabado")
    SEMI_ACABADO("Semi-acabado"),
    @XmlEnumValue("Inacabado")
    INACABADO("Inacabado");
    private final String value;

    TdDesCondVeh(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDesCondVeh fromValue(String v) {
        for (TdDesCondVeh c: TdDesCondVeh.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
