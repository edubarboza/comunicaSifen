package py.com.fecyl.comunicasifen.util;

import py.com.fecyl.comunicasifen.wsdl.de.RProtDe;

public class SifenResponseMoldelDE {
    //CDC del DE Procesado
    String cdc;
    //Fecha del procesaminto en sifen
    String dFecProc;
    //Estado del resultado
    String dEstRes;
    //Codigo del resultado del procesamiento
    Long dCodRes;
    //Mensaje del resultado de procesamiento
    String dMsgRes;

    public SifenResponseMoldelDE(RProtDe sifenResponse) {
        this.cdc = sifenResponse.getId();
        this.dFecProc = sifenResponse.getDFecProc().toString();
        this.dEstRes = sifenResponse.getDEstRes();
        this.dCodRes = Long.parseLong(sifenResponse.getGResProc().get(0).getDCodRes());
        this.dMsgRes = sifenResponse.getGResProc().get(0).getDMsgRes();
    }

    public String getCdc() {
        return cdc;
    }

    public void setCdc(String cdc) {
        this.cdc = cdc;
    }

    public String getdFecProc() {
        return dFecProc;
    }

    public void setdFecProc(String dFecProc) {
        this.dFecProc = dFecProc;
    }

    public String getdEstRes() {
        return dEstRes;
    }

    public void setdEstRes(String dEstRes) {
        this.dEstRes = dEstRes;
    }

    public Long getdCodRes() {
        return dCodRes;
    }

    public void setdCodRes(Long dCodRes) {
        this.dCodRes = dCodRes;
    }

    public String getdMsgRes() {
        return dMsgRes;
    }

    public void setdMsgRes(String dMsgRes) {
        this.dMsgRes = dMsgRes;
    }
}
