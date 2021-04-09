
package br.com.varejoseguros.api.request;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Endereco implements Serializable {

    @SerializedName("cep")
    @Expose
    private String cep;
    @SerializedName("complemento")
    @Expose
    private String complemento;
    @SerializedName("numero")
    @Expose
    private String numero;
    private final static long serialVersionUID = -5976893860769085037L;

    public Endereco(String cep, String complemento, String numero) {
        this.cep = cep;
        this.complemento = complemento;
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", complemento='" + complemento + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
