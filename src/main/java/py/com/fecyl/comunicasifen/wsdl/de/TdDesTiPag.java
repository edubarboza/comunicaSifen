
package py.com.fecyl.comunicasifen.wsdl.de;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdDesTiPag.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesTiPag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Efectivo"/>
 *     &lt;enumeration value="Cheque"/>
 *     &lt;enumeration value="Tarjeta de crédito"/>
 *     &lt;enumeration value="Tarjeta de débito"/>
 *     &lt;enumeration value="Transferencia"/>
 *     &lt;enumeration value="Giro"/>
 *     &lt;enumeration value="Billetera electrónica"/>
 *     &lt;enumeration value="Tarjeta empresarial"/>
 *     &lt;enumeration value="Vale"/>
 *     &lt;enumeration value="Retención"/>
 *     &lt;enumeration value="Anticipo"/>
 *     &lt;enumeration value="Valor fiscal"/>
 *     &lt;enumeration value="Valor comercial"/>
 *     &lt;enumeration value="Compensación"/>
 *     &lt;enumeration value="Permuta"/>
 *     &lt;enumeration value="Pago bancario"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "tdDesTiPag", namespace = "http://ekuatia.set.gov.py/sifen/xsd")
@XmlEnum
public enum TdDesTiPag {

    @XmlEnumValue("Efectivo")
    EFECTIVO("Efectivo"),
    @XmlEnumValue("Cheque")
    CHEQUE("Cheque"),
    @XmlEnumValue("Tarjeta de cr\u00e9dito")
    TARJETA_DE_CRÉDITO("Tarjeta de cr\u00e9dito"),
    @XmlEnumValue("Tarjeta de d\u00e9bito")
    TARJETA_DE_DÉBITO("Tarjeta de d\u00e9bito"),
    @XmlEnumValue("Transferencia")
    TRANSFERENCIA("Transferencia"),
    @XmlEnumValue("Giro")
    GIRO("Giro"),
    @XmlEnumValue("Billetera electr\u00f3nica")
    BILLETERA_ELECTRÓNICA("Billetera electr\u00f3nica"),
    @XmlEnumValue("Tarjeta empresarial")
    TARJETA_EMPRESARIAL("Tarjeta empresarial"),
    @XmlEnumValue("Vale")
    VALE("Vale"),
    @XmlEnumValue("Retenci\u00f3n")
    RETENCIÓN("Retenci\u00f3n"),
    @XmlEnumValue("Anticipo")
    ANTICIPO("Anticipo"),
    @XmlEnumValue("Valor fiscal")
    VALOR_FISCAL("Valor fiscal"),
    @XmlEnumValue("Valor comercial")
    VALOR_COMERCIAL("Valor comercial"),
    @XmlEnumValue("Compensaci\u00f3n")
    COMPENSACIÓN("Compensaci\u00f3n"),
    @XmlEnumValue("Permuta")
    PERMUTA("Permuta"),
    @XmlEnumValue("Pago bancario")
    PAGO_BANCARIO("Pago bancario");
    private final String value;

    TdDesTiPag(String v) {
        value = v;
    }

    public static TdDesTiPag fromValue(String v) {
        for (TdDesTiPag c : TdDesTiPag.values()) {
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
