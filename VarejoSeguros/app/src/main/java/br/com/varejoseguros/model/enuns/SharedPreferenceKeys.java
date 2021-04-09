package br.com.varejoseguros.model.enuns;

public enum  SharedPreferenceKeys {

    USUARIO("usuario"),
    SENHA("senha"),
    ACCESS_TOKEN("access_token"),
    VENDEDOR_CPF("cpfCnpjVendedor"),
    VENDEDOR_CONTATO("numeroCelularVendedor"),
    VENDEDOR_ID_LOJA("idLoja");

    private final String value;

    SharedPreferenceKeys(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
