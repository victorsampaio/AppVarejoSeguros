
package br.com.varejoseguros.api.request;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comprador implements Serializable {

    @SerializedName("cpfCnpj")
    @Expose
    private String cpfCnpj;
    @SerializedName("numeroCelular")
    @Expose
    private String numeroCelular;
    @SerializedName("endereco")
    @Expose
    private Endereco endereco;
    private final static long serialVersionUID = 7817712228477460441L;

    public Comprador(String cpfCnpj, String numeroCelular, Endereco endereco) {
        this.cpfCnpj = cpfCnpj;
        this.numeroCelular = numeroCelular;
        this.endereco = endereco;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "cpfCnpj='" + cpfCnpj + '\'' +
                ", numeroCelular='" + numeroCelular + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
