package br.com.varejoseguros.model;

public class Endereco {

    private String cep;
    private String complemento;
    private String numero;

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
