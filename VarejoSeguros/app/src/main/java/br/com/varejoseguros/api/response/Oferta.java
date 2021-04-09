
package br.com.varejoseguros.api.response;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Oferta implements Serializable {

    @SerializedName("familias")
    @Expose
    private List<Familia> familias = null;
    private final static long serialVersionUID = -8810150204889695604L;

    public Oferta(List<Familia> familias) {
        this.familias = familias;
    }

    public List<Familia> getFamilias() {
        return familias;
    }

    public void setFamilias(List<Familia> familias) {
        this.familias = familias;
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "familias=" + familias +
                '}';
    }
}
