package br.com.varejoseguros.api;

public enum AccessConfig {

    AUTHORIZATION("authorization"),

    /* URL Desenvolvimento */
    BASE_URL("http://ibug.westus.cloudapp.azure.com/APIServiceVarejo");

    /* URL Produção */
    //BASE_URL("");

    private final String value;

    AccessConfig(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
