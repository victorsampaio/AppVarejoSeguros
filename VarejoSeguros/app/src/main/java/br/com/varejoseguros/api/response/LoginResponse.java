package br.com.varejoseguros.api.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

public @Data class LoginResponse {

    @Expose
    @SerializedName("access_token")
    private String accesstoken;

    @Expose
    @SerializedName("token_type")
    private String token_type;

    @Expose
    @SerializedName("expires_in")
    private String expire_in;

    @Expose
    @SerializedName("error")
    private String error;
}
