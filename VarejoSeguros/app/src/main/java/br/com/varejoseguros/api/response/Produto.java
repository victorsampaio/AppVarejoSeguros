
package br.com.varejoseguros.api.response;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Produto implements Serializable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("idFamilia")
    @Expose
    private String idFamilia;
    @SerializedName("nome")
    @Expose
    private String nome;
    @SerializedName("descricao")
    @Expose
    private String descricao;
    @SerializedName("ValorDisponivel")
    @Expose
    private String valorDisponivel;
    @SerializedName("saldo")
    @Expose
    private String saldo;
    @SerializedName("inicioVigencia")
    @Expose
    private String inicioVigencia;
    @SerializedName("finalVigencia")
    @Expose
    private String finalVigencia;
    @SerializedName("Categorias")
    @Expose
    private List<Categoria> categorias = null;
    @SerializedName("Tipo")
    @Expose
    private String tipo;
    @SerializedName("Valor")
    @Expose
    private String valor;
    private final static long serialVersionUID = -1945528347700790681L;

    public Produto(String id, String idFamilia, String nome, String descricao, String valorDisponivel,
                   String saldo, String inicioVigencia, String finalVigencia,
                   List<Categoria> categorias, String tipo, String valor) {
        this.id = id;
        this.idFamilia = idFamilia;
        this.nome = nome;
        this.descricao = descricao;
        this.valorDisponivel = valorDisponivel;
        this.saldo = saldo;
        this.inicioVigencia = inicioVigencia;
        this.finalVigencia = finalVigencia;
        this.categorias = categorias;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(String idFamilia) {
        this.idFamilia = idFamilia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValorDisponivel() {
        return valorDisponivel;
    }

    public void setValorDisponivel(String valorDisponivel) {
        this.valorDisponivel = valorDisponivel;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(String inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public String getFinalVigencia() {
        return finalVigencia;
    }

    public void setFinalVigencia(String finalVigencia) {
        this.finalVigencia = finalVigencia;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
