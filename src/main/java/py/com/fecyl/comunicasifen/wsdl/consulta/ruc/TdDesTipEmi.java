
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesTipEmi.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesTipEmi">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="6"/>
 *     &lt;maxLength value="12"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Contingencia"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tdDesTipEmi")
@XmlEnum
public enum TdDesTipEmi {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Contingencia")
    CONTINGENCIA("Contingencia");
    private final String value;

    TdDesTipEmi(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDesTipEmi fromValue(String v) {
        for (TdDesTipEmi c: TdDesTipEmi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
