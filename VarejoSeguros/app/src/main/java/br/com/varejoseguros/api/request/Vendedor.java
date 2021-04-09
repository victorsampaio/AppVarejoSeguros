
package br.com.varejoseguros.api.request;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vendedor implements Serializable {

    @SerializedName("cpfCnpjVendedor")
    @Expose
    private String cpfCnpjVendedor;
    @SerializedName("idloja")
    @Expose
    private String idloja;
    @SerializedName("numeroCelularVendedor")
    @Expose
    private String numeroCelularVendedor;
    private final static long serialVersionUID = 4953026262341526403L;

    public Vendedor(String cpfCnpjVendedor, String idloja, String numeroCelularVendedor) {
        this.cpfCnpjVendedor = cpfCnpjVendedor;
        this.idloja = idloja;
        this.numeroCelularVendedor = numeroCelularVendedor;
    }

    public String getCpfCnpjVendedor() {
        return cpfCnpjVendedor;
    }

    public void setCpfCnpjVendedor(String cpfCnpjVendedor) {
        this.cpfCnpjVendedor = cpfCnpjVendedor;
    }

    public String getIdloja() {
        return idloja;
    }

    public void setIdloja(String idloja) {
        this.idloja = idloja;
    }

    public String getNumeroCelularVendedor() {
        return numeroCelularVendedor;
    }

    public void setNumeroCelularVendedor(String numeroCelularVendedor) {
        this.numeroCelularVendedor = numeroCelularVendedor;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "cpfCnpjVendedor='" + cpfCnpjVendedor + '\'' +
                ", idloja='" + idloja + '\'' +
                ", numeroCelularVendedor='" + numeroCelularVendedor + '\'' +
                '}';
    }
}
