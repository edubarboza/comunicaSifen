
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesTiDE.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesTiDE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Factura electr�nica"/>
 *     &lt;enumeration value="Nota de cr�dito electr�nica"/>
 *     &lt;enumeration value="Nota de d�bito electr�nica"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tdDesTiDE")
@XmlEnum
public enum TdDesTiDE {

    @XmlEnumValue("Factura electr\u00f3nica")
    FACTURA_ELECTRONICA("Factura electr\u00f3nica"),
    @XmlEnumValue("Nota de cr\u00e9dito electr\u00f3nica")
    NOTA_DE_CREDITO_ELECTRONICA("Nota de cr\u00e9dito electr\u00f3nica"),
    @XmlEnumValue("Nota de d\u00e9bito electr\u00f3nica")
    NOTA_DE_DEBITO_ELECTRONICA("Nota de d\u00e9bito electr\u00f3nica");
    private final String value;

    TdDesTiDE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDesTiDE fromValue(String v) {
        for (TdDesTiDE c: TdDesTiDE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
