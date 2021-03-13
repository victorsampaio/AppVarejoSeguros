package br.com.varejoseguros.api.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

public class LoginResponse {

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

    public String getAccesstoken() {
        return accesstoken;
    }

    public String getToken_type() {
        return token_type;
    }

    public String getExpire_in() {
        return expire_in;
    }

    public String isError() {
        return error;
    }

    public void setAccesstoken(String accesstoken) {
        this.accesstoken = accesstoken;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public void setExpire_in(String expire_in) {
        this.expire_in = expire_in;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
