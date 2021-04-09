package br.com.varejoseguros.api;

public enum AccessConfig {

    AUTHORIZATION("authorization"),
    BASE_URL_DEV("http://ibug.westus.cloudapp.azure.com/APIServiceVarejo"),
    BASE_URL_PROD("");

    private final String value;

    AccessConfig(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
