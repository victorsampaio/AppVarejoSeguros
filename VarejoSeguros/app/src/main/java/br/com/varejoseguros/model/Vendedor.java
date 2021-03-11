package br.com.varejoseguros.model;

public class Vendedor {

    private String cpfCnpjVendedor;
    private String idloja;
    private String numeroCelularVendedor;

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
