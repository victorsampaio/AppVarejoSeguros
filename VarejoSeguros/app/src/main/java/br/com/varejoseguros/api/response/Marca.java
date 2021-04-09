
package br.com.varejoseguros.api.response;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Marca implements Serializable {

    @SerializedName("nome")
    @Expose
    private String nome;
    @SerializedName("id")
    @Expose
    private String id;
    private final static long serialVersionUID = 6005864302894084373L;

    public Marca(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
