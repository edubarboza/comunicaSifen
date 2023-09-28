
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesTIpoDoc.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesTIpoDoc">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Factura"/>
 *     &lt;enumeration value="Nota de cr�dito"/>
 *     &lt;enumeration value="Nota de d�bito"/>
 *     &lt;enumeration value="Nota de remisi�n"/>
 *     &lt;enumeration value="Comprobante de retenci�n"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tdDesTIpoDoc")
@XmlEnum
public enum TdDesTIpoDoc {

    @XmlEnumValue("Factura")
    FACTURA("Factura"),
    @XmlEnumValue("Nota de cr\u00e9dito")
    NOTA_DE_CREDITO("Nota de cr\u00e9dito"),
    @XmlEnumValue("Nota de d\u00e9bito")
    NOTA_DE_DEBITO("Nota de d\u00e9bito"),
    @XmlEnumValue("Nota de remisi\u00f3n")
    NOTA_DE_REMISION("Nota de remisi\u00f3n"),
    @XmlEnumValue("Comprobante de retenci\u00f3n")
    COMPROBANTE_DE_RETENCION("Comprobante de retenci\u00f3n");
    private final String value;

    TdDesTIpoDoc(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDesTIpoDoc fromValue(String v) {
        for (TdDesTIpoDoc c: TdDesTIpoDoc.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
