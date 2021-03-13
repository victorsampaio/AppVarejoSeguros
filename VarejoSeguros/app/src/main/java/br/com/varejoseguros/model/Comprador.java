package br.com.varejoseguros.model;

public class Comprador {

    private String  cpfCnpj;
    private String  numeroCelular;
    private Endereco endereco;

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
