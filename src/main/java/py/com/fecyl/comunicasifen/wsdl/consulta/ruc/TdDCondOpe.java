
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDCondOpe.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDCondOpe">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Contado"/>
 *     &lt;enumeration value="Cr�dito"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tdDCondOpe")
@XmlEnum
public enum TdDCondOpe {

    @XmlEnumValue("Contado")
    CONTADO("Contado"),
    @XmlEnumValue("Cr\u00e9dito")
    CREDITO("Cr\u00e9dito");
    private final String value;

    TdDCondOpe(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDCondOpe fromValue(String v) {
        for (TdDCondOpe c: TdDCondOpe.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
