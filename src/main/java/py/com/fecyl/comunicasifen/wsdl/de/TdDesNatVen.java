
package py.com.fecyl.comunicasifen.wsdl.de;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdDesNatVen.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesNatVen">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="10"/>
 *     &lt;maxLength value="16"/>
 *     &lt;enumeration value="No contribuyente"/>
 *     &lt;enumeration value="Extranjero"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "tdDesNatVen", namespace = "http://ekuatia.set.gov.py/sifen/xsd")
@XmlEnum
public enum TdDesNatVen {

    @XmlEnumValue("No contribuyente")
    NO_CONTRIBUYENTE("No contribuyente"),
    @XmlEnumValue("Extranjero")
    EXTRANJERO("Extranjero");
    private final String value;

    TdDesNatVen(String v) {
        value = v;
    }

    public static TdDesNatVen fromValue(String v) {
        for (TdDesNatVen c : TdDesNatVen.values()) {
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
