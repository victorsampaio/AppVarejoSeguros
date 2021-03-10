package br.com.varejoseguros.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import lombok.Data;

public @Data
class Usuario implements Serializable {

    @Expose
    @SerializedName("id")
    private Long id;

    @Expose
    @SerializedName("username")
    private String nome;

    @Expose
    @SerializedName("email")
    private String email;

    private String token;
}
