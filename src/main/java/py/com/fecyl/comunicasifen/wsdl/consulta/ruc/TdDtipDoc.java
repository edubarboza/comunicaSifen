
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDtipDoc.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDtipDoc">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="C�dula paraguaya"/>
 *     &lt;enumeration value="Pasaporte"/>
 *     &lt;enumeration value="C�dula extranjera"/>
 *     &lt;enumeration value="Carnet de residencia"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tdDtipDoc")
@XmlEnum
public enum TdDtipDoc {

    @XmlEnumValue("C\u00e9dula paraguaya")
    CEDULA_PARAGUAYA("C\u00e9dula paraguaya"),
    @XmlEnumValue("Pasaporte")
    PASAPORTE("Pasaporte"),
    @XmlEnumValue("C\u00e9dula extranjera")
    CEDULA_EXTRANJERA("C\u00e9dula extranjera"),
    @XmlEnumValue("Carnet de residencia")
    CARNET_DE_RESIDENCIA("Carnet de residencia");
    private final String value;

    TdDtipDoc(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TdDtipDoc fromValue(String v) {
        for (TdDtipDoc c: TdDtipDoc.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
