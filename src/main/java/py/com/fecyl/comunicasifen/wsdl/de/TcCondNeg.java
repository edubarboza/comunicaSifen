
package py.com.fecyl.comunicasifen.wsdl.de;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tcCondNeg.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
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
 */
@XmlType(name = "tcCondNeg", namespace = "http://ekuatia.set.gov.py/sifen/xsd")
@XmlEnum
public enum TcCondNeg {


    /**
     * Costo y flete
     */
    CFR,

    /**
     * Costo, seguro y flete
     */
    CIF,

    /**
     * Transporte y seguros pagados hasta
     */
    CIP,

    /**
     * Transporte pagado hasta
     */
    CPT,

    /**
     * Entregada en el lugar convenido
     */
    DAP,

    /**
     * Entregada en terminal
     */
    DAT,

    /**
     * Entregada derechos pagados
     */
    DDP,

    /**
     * En fabrica
     */
    EXW,

    /**
     * Franco al costado del buque
     */
    FAS,

    /**
     * Franco transportista
     */
    FCA,

    /**
     * Franco a bordo
     */
    FOB;

    public static TcCondNeg fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }

}
