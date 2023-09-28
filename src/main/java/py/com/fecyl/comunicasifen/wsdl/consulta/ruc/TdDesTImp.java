
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdDesTImp.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tdDesTImp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IVA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tdDesTImp")
@XmlEnum
public enum TdDesTImp {


    /**
     * 
     * 						Corresponde al codigo 1 del campo dDesTimp
     * 							
     * 
     */
    IVA;

    public String value() {
        return name();
    }

    public static TdDesTImp fromValue(String v) {
        return valueOf(v);
    }

}
