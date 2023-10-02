
package py.com.fecyl.comunicasifen.wsdl.de;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdDesTipCons.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesTipCons">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Constancia de no ser contribuyente"/>
 *     &lt;enumeration value="Constancia de microproductores"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "tdDesTipCons", namespace = "http://ekuatia.set.gov.py/sifen/xsd")
@XmlEnum
public enum TdDesTipCons {

    @XmlEnumValue("Constancia de no ser contribuyente")
    CONSTANCIA_DE_NO_SER_CONTRIBUYENTE("Constancia de no ser contribuyente"),
    @XmlEnumValue("Constancia de microproductores")
    CONSTANCIA_DE_MICROPRODUCTORES("Constancia de microproductores");
    private final String value;

    TdDesTipCons(String v) {
        value = v;
    }

    public static TdDesTipCons fromValue(String v) {
        for (TdDesTipCons c : TdDesTipCons.values()) {
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
