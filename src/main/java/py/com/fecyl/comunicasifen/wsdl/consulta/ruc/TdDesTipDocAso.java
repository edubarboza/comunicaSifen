
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesTipDocAso.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesTipDocAso">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Electr�nico"/>
 *     &lt;enumeration value="Impreso"/>
 *     &lt;minLength value="1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tdDesTipDocAso")
@XmlEnum
public enum TdDesTipDocAso {

    @XmlEnumValue("Electr\u00f3nico")
    ELECTRONICO("Electr\u00f3nico"),
    @XmlEnumValue("Impreso")
    IMPRESO("Impreso");
    private final String value;

    TdDesTipDocAso(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDesTipDocAso fromValue(String v) {
        for (TdDesTipDocAso c: TdDesTipDocAso.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
