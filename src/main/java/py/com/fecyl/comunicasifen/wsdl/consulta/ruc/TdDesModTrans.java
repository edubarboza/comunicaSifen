
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesModTrans.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesModTrans">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Terrestre"/>
 *     &lt;enumeration value="Fluvial"/>
 *     &lt;enumeration value="A�reo"/>
 *     &lt;enumeration value="Multimodal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tdDesModTrans")
@XmlEnum
public enum TdDesModTrans {

    @XmlEnumValue("Terrestre")
    TERRESTRE("Terrestre"),
    @XmlEnumValue("Fluvial")
    FLUVIAL("Fluvial"),
    @XmlEnumValue("A\u00e9reo")
    AEREO("A\u00e9reo"),
    @XmlEnumValue("Multimodal")
    MULTIMODAL("Multimodal");
    private final String value;

    TdDesModTrans(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDesModTrans fromValue(String v) {
        for (TdDesModTrans c: TdDesModTrans.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
