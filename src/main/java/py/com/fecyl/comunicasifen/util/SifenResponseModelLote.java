package py.com.fecyl.comunicasifen.util;

import javax.activation.DataHandler;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import java.math.BigInteger;

public class SifenResponseModelLote {
    private Holder<XMLGregorianCalendar> dFecProc;
    private Holder<String> dCodRes;
    private Holder<String> dMsgRes;
    private Holder<Long> dProtConsLote;
    private Holder<BigInteger> dTpoProces;
    private BigInteger loteId;
    private DataHandler xDE;

    public SifenResponseModelLote() {
    }

    public SifenResponseModelLote(DataHandler xDE, Holder<XMLGregorianCalendar> dFecProc,
                                  Holder<String> dCodRes, Holder<String> dMsgRes, Holder<Long> dProtConsLote,
                                  Holder<BigInteger> dTpoProces, BigInteger bigInteger) {
        this.xDE = xDE;
        this.dFecProc = dFecProc;
        this.dCodRes = dCodRes;
        this.dMsgRes = dMsgRes;
        this.dProtConsLote = dProtConsLote;
        this.dTpoProces = dTpoProces;
        this.loteId = bigInteger;
    }

    public DataHandler getxDE() {
        return xDE;
    }

    public void setxDE(DataHandler xDE) {
        this.xDE = xDE;
    }

    public Holder<XMLGregorianCalendar> getdFecProc() {
        return dFecProc;
    }

    public void setdFecProc(Holder<XMLGregorianCalendar> dFecProc) {
        this.dFecProc = dFecProc;
    }

    public Holder<String> getdCodRes() {
        return dCodRes;
    }

    public void setdCodRes(Holder<String> dCodRes) {
        this.dCodRes = dCodRes;
    }

    public Holder<String> getdMsgRes() {
        return dMsgRes;
    }

    public void setdMsgRes(Holder<String> dMsgRes) {
        this.dMsgRes = dMsgRes;
    }

    public Holder<Long> getdProtConsLote() {
        return dProtConsLote;
    }

    public void setdProtConsLote(Holder<Long> dProtConsLote) {
        this.dProtConsLote = dProtConsLote;
    }

    public Holder<BigInteger> getdTpoProces() {
        return dTpoProces;
    }

    public void setdTpoProces(Holder<BigInteger> dTpoProces) {
        this.dTpoProces = dTpoProces;
    }

    public BigInteger getLoteId() {
        return loteId;
    }

    public void setLoteId(BigInteger bigInteger) {
        this.loteId = bigInteger;
    }


}
