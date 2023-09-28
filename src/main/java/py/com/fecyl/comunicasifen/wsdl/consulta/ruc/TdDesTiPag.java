
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesTiPag.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesTiPag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Efectivo"/>
 *     &lt;enumeration value="Cheque"/>
 *     &lt;enumeration value="Tarjeta de cr�dito"/>
 *     &lt;enumeration value="Tarjeta de d�bito"/>
 *     &lt;enumeration value="Transferencia"/>
 *     &lt;enumeration value="Giro"/>
 *     &lt;enumeration value="Billetera electr�nica"/>
 *     &lt;enumeration value="Tarjeta empresarial"/>
 *     &lt;enumeration value="Vale"/>
 *     &lt;enumeration value="Retenci�n"/>
 *     &lt;enumeration value="Anticipo"/>
 *     &lt;enumeration value="Valor fiscal"/>
 *     &lt;enumeration value="Valor comercial"/>
 *     &lt;enumeration value="Compensaci�n"/>
 *     &lt;enumeration value="Permuta"/>
 *     &lt;enumeration value="Pago bancario"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tdDesTiPag")
@XmlEnum
public enum TdDesTiPag {

    @XmlEnumValue("Efectivo")
    EFECTIVO("Efectivo"),
    @XmlEnumValue("Cheque")
    CHEQUE("Cheque"),
    @XmlEnumValue("Tarjeta de cr\u00e9dito")
    TARJETA_DE_CREDITO("Tarjeta de cr\u00e9dito"),
    @XmlEnumValue("Tarjeta de d\u00e9bito")
    TARJETA_DE_DEBITO("Tarjeta de d\u00e9bito"),
    @XmlEnumValue("Transferencia")
    TRANSFERENCIA("Transferencia"),
    @XmlEnumValue("Giro")
    GIRO("Giro"),
    @XmlEnumValue("Billetera electr\u00f3nica")
    BILLETERA_ELECTRONICA("Billetera electr\u00f3nica"),
    @XmlEnumValue("Tarjeta empresarial")
    TARJETA_EMPRESARIAL("Tarjeta empresarial"),
    @XmlEnumValue("Vale")
    VALE("Vale"),
    @XmlEnumValue("Retenci\u00f3n")
    RETENCION("Retenci\u00f3n"),
    @XmlEnumValue("Anticipo")
    ANTICIPO("Anticipo"),
    @XmlEnumValue("Valor fiscal")
    VALOR_FISCAL("Valor fiscal"),
    @XmlEnumValue("Valor comercial")
    VALOR_COMERCIAL("Valor comercial"),
    @XmlEnumValue("Compensaci\u00f3n")
    COMPENSACION("Compensaci\u00f3n"),
    @XmlEnumValue("Permuta")
    PERMUTA("Permuta"),
    @XmlEnumValue("Pago bancario")
    PAGO_BANCARIO("Pago bancario");
    private final String value;

    TdDesTiPag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDesTiPag fromValue(String v) {
        for (TdDesTiPag c: TdDesTiPag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
