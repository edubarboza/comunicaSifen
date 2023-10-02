
package py.com.fecyl.comunicasifen.wsdl.de;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdDesTIpoDoc.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesTIpoDoc">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Factura"/>
 *     &lt;enumeration value="Nota de crédito"/>
 *     &lt;enumeration value="Nota de débito"/>
 *     &lt;enumeration value="Nota de remisión"/>
 *     &lt;enumeration value="Comprobante de retención"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "tdDesTIpoDoc", namespace = "http://ekuatia.set.gov.py/sifen/xsd")
@XmlEnum
public enum TdDesTIpoDoc {

    @XmlEnumValue("Factura")
    FACTURA("Factura"),
    @XmlEnumValue("Nota de cr\u00e9dito")
    NOTA_DE_CRÉDITO("Nota de cr\u00e9dito"),
    @XmlEnumValue("Nota de d\u00e9bito")
    NOTA_DE_DÉBITO("Nota de d\u00e9bito"),
    @XmlEnumValue("Nota de remisi\u00f3n")
    NOTA_DE_REMISIÓN("Nota de remisi\u00f3n"),
    @XmlEnumValue("Comprobante de retenci\u00f3n")
    COMPROBANTE_DE_RETENCIÓN("Comprobante de retenci\u00f3n");
    private final String value;

    TdDesTIpoDoc(String v) {
        value = v;
    }

    public static TdDesTIpoDoc fromValue(String v) {
        for (TdDesTIpoDoc c : TdDesTIpoDoc.values()) {
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
