
package br.com.varejoseguros.api.response;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Familia implements Serializable {

    @SerializedName("nome")
    @Expose
    private String nome;
    @SerializedName("Produtos")
    @Expose
    private List<Produto> produtos = null;
    private final static long serialVersionUID = 8329808184524435544L;

    public Familia(String nome, List<Produto> produtos) {
        this.nome = nome;
        this.produtos = produtos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Familia{" +
                "nome='" + nome + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}
