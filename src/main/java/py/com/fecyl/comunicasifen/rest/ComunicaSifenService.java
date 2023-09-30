/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.fecyl.comunicasifen.rest;

import java.io.InputStream;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import py.com.fecyl.comunicasifen.bean.SifenServices;
import py.com.fecyl.comunicasifen.util.ConsultaRucRequest;

/**
 *
 * @author luis.barboza
 */
@Path("comunicacion")
public class ComunicaSifenService {
    
    @EJB
    SifenServices sifenServices;
    
    @Path("/consultaRUC")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_XML)
    public Object consultaRuc(InputStream xmlInputStream){
        //Llama al servicio para enviar el RUC
        return sifenServices.consultarRUC(xmlInputStream);
    }
    
    @Path("/consultaRucPorNro")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Object consultaRucPorNro(ConsultaRucRequest request){
        //Llama al servicio para enviar el RUC
        return sifenServices.consultarRUC(request);
    }
}
