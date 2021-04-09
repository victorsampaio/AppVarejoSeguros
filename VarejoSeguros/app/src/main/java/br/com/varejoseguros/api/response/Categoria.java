
package br.com.varejoseguros.api.response;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Categoria implements Serializable {

    @SerializedName("nome")
    @Expose
    private String nome;
    @SerializedName("valorMinimoVenda")
    @Expose
    private String valorMinimoVenda;
    @SerializedName("percentualCalculo")
    @Expose
    private String percentualCalculo;
    @SerializedName("marcas")
    @Expose
    private List<Marca> marcas = null;
    @SerializedName("limiteMinimoNotaFiscal")
    @Expose
    private String limiteMinimoNotaFiscal;
    private final static long serialVersionUID = -3316462722679229195L;

    public Categoria(String nome, String valorMinimoVenda, String percentualCalculo, List<Marca> marcas, String limiteMinimoNotaFiscal) {
        this.nome = nome;
        this.valorMinimoVenda = valorMinimoVenda;
        this.percentualCalculo = percentualCalculo;
        this.marcas = marcas;
        this.limiteMinimoNotaFiscal = limiteMinimoNotaFiscal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValorMinimoVenda() {
        return valorMinimoVenda;
    }

    public void setValorMinimoVenda(String valorMinimoVenda) {
        this.valorMinimoVenda = valorMinimoVenda;
    }

    public String getPercentualCalculo() {
        return percentualCalculo;
    }

    public void setPercentualCalculo(String percentualCalculo) {
        this.percentualCalculo = percentualCalculo;
    }

    public List<Marca> getMarcas() {
        return marcas;
    }

    public void setMarcas(List<Marca> marcas) {
        this.marcas = marcas;
    }

    public String getLimiteMinimoNotaFiscal() {
        return limiteMinimoNotaFiscal;
    }

    public void setLimiteMinimoNotaFiscal(String limiteMinimoNotaFiscal) {
        this.limiteMinimoNotaFiscal = limiteMinimoNotaFiscal;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + nome + '\'' +
                ", valorMinimoVenda='" + valorMinimoVenda + '\'' +
                ", percentualCalculo='" + percentualCalculo + '\'' +
                ", marcas=" + marcas +
                ", limiteMinimoNotaFiscal='" + limiteMinimoNotaFiscal + '\'' +
                '}';
    }
}
