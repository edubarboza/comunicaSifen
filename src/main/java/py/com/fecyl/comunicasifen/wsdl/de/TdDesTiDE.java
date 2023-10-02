
package py.com.fecyl.comunicasifen.wsdl.de;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdDesTiDE.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesTiDE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Factura electrónica"/>
 *     &lt;enumeration value="Autofactura electrónica"/>
 *     &lt;enumeration value="Nota de crédito electrónica"/>
 *     &lt;enumeration value="Nota de débito electrónica"/>
 *     &lt;enumeration value="Nota de remisión electrónica"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "tdDesTiDE", namespace = "http://ekuatia.set.gov.py/sifen/xsd")
@XmlEnum
public enum TdDesTiDE {

    @XmlEnumValue("Factura electr\u00f3nica")
    FACTURA_ELECTRÓNICA("Factura electr\u00f3nica"),
    @XmlEnumValue("Autofactura electr\u00f3nica")
    AUTOFACTURA_ELECTRÓNICA("Autofactura electr\u00f3nica"),
    @XmlEnumValue("Nota de cr\u00e9dito electr\u00f3nica")
    NOTA_DE_CRÉDITO_ELECTRÓNICA("Nota de cr\u00e9dito electr\u00f3nica"),
    @XmlEnumValue("Nota de d\u00e9bito electr\u00f3nica")
    NOTA_DE_DÉBITO_ELECTRÓNICA("Nota de d\u00e9bito electr\u00f3nica"),
    @XmlEnumValue("Nota de remisi\u00f3n electr\u00f3nica")
    NOTA_DE_REMISIÓN_ELECTRÓNICA("Nota de remisi\u00f3n electr\u00f3nica");
    private final String value;

    TdDesTiDE(String v) {
        value = v;
    }

    public static TdDesTiDE fromValue(String v) {
        for (TdDesTiDE c : TdDesTiDE.values()) {
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
