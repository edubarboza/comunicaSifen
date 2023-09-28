package py.com.fecyl.comunicasifen.util;

/**
 *
 */
public class KResponse<T> {

    Integer estado;
    String mensaje;
    T dato;

    public KResponse() {
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "KResponse{" + "estado=" + estado + ", mensaje=" + mensaje + ", dato=" + dato + '}';
    }

}
