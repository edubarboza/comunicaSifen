
package py.com.fecyl.comunicasifen.wsdl.consulta.ruc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tcCondNeg.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tcCondNeg">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CFR"/>
 *     &lt;enumeration value="CIF"/>
 *     &lt;enumeration value="CIP"/>
 *     &lt;enumeration value="CPT"/>
 *     &lt;enumeration value="DAP"/>
 *     &lt;enumeration value="DAT"/>
 *     &lt;enumeration value="DDP"/>
 *     &lt;enumeration value="EXW"/>
 *     &lt;enumeration value="FAS"/>
 *     &lt;enumeration value="FCA"/>
 *     &lt;enumeration value="FOB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tcCondNeg")
@XmlEnum
public enum TcCondNeg {


    /**
     * 
     * 						Costo y flete
     * 							
     * 
     */
    CFR,

    /**
     * 
     * 						Costo, seguro y flete
     * 							
     * 
     */
    CIF,

    /**
     * 
     * 						Transporte y seguros pagados hasta
     * 							
     * 
     */
    CIP,

    /**
     * 
     * 						Transporte pagado hasta
     * 							
     * 
     */
    CPT,

    /**
     * 
     * 						Entregada en el lugar convenido
     * 							
     * 
     */
    DAP,

    /**
     * 
     * 						Entregada en terminal
     * 							
     * 
     */
    DAT,

    /**
     * 
     * 						Entregada derechos pagados
     * 							
     * 
     */
    DDP,

    /**
     * 
     * 						En fabrica
     * 							
     * 
     */
    EXW,

    /**
     * 
     * 						Franco al costado del buque
     * 							
     * 
     */
    FAS,

    /**
     * 
     * 						Franco transportista
     * 							
     * 
     */
    FCA,

    /**
     * 
     * 						Franco a bordo
     * 							
     * 
     */
    FOB;

    public String value() {
        return name();
    }

    public static TcCondNeg fromValue(String v) {
        return valueOf(v);
    }

}
