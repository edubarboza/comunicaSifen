
package py.com.fecyl.comunicasifen.wsdl.lote;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdDtipDocRec.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDtipDocRec">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cédula paraguaya"/>
 *     &lt;enumeration value="Pasaporte"/>
 *     &lt;enumeration value="Cédula extranjera"/>
 *     &lt;enumeration value="Carnet de residencia"/>
 *     &lt;enumeration value="Innominado"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "tdDtipDocRec")
@XmlEnum
public enum TdDtipDocRec {

    @XmlEnumValue("C\u00e9dula paraguaya")
    CÉDULA_PARAGUAYA("C\u00e9dula paraguaya"),
    @XmlEnumValue("Pasaporte")
    PASAPORTE("Pasaporte"),
    @XmlEnumValue("C\u00e9dula extranjera")
    CÉDULA_EXTRANJERA("C\u00e9dula extranjera"),
    @XmlEnumValue("Carnet de residencia")
    CARNET_DE_RESIDENCIA("Carnet de residencia"),
    @XmlEnumValue("Innominado")
    INNOMINADO("Innominado");
    private final String value;

    TdDtipDocRec(String v) {
        value = v;
    }

    public static TdDtipDocRec fromValue(String v) {
        for (TdDtipDocRec c : TdDtipDocRec.values()) {
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
