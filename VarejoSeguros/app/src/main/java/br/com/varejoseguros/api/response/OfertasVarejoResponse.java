
package br.com.varejoseguros.api.response;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OfertasVarejoResponse implements Serializable {

    @SerializedName("ofertas")
    @Expose
    private List<Oferta> ofertas = null;
    private final static long serialVersionUID = 6222487830973014904L;

    public OfertasVarejoResponse(List<Oferta> ofertas) {
        this.ofertas = ofertas;
    }

    public List<Oferta> getOfertas() {
        return ofertas;
    }

    public void setOfertas(List<Oferta> ofertas) {
        this.ofertas = ofertas;
    }

    @Override
    public String toString() {
        return "OfertasVarejoResponse{" +
                "ofertas=" + ofertas +
                '}';
    }
}
