package br.com.varejoseguros.api;

public enum AccessConfig {

    AUTHORIZATION("authorization"),
    BASE_URL_DEV("http://ibug.westus.cloudapp.azure.com:80/ApiService/"),
    BASE_URL_PROD("http://ibug.westus.cloudapp.azure.com:80/ApiService/");

    private final String value;

    AccessConfig(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
