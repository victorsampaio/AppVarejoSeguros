
package br.com.varejoseguros.api.request;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OfertasVarejoRequest implements Serializable {

    @SerializedName("vendedor")
    @Expose
    private Vendedor vendedor;
    @SerializedName("comprador")
    @Expose
    private Comprador comprador;
    private final static long serialVersionUID = -1603973691676002497L;

    public OfertasVarejoRequest(Vendedor vendedor, Comprador comprador) {
        this.vendedor = vendedor;
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    @Override
    public String toString() {
        return "OfertasVarejoRequest{" +
                "vendedor=" + vendedor +
                ", comprador=" + comprador +
                '}';
    }
}
