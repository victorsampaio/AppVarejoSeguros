package br.com.varejoseguros.util;

public class ValidaCpf {

    public Boolean testaCPF(String cpf) {

        cpf = cpf.replace(".", "").replace("-", "");
        int Soma = 0;
        int Resto = 0;

        if (cpf == "00000000000") return false;

        if (cpf.length() < 11) return false;

        for (int i = 1; i <= 9; i++) {
            Soma = Soma + Integer.parseInt(cpf.substring(i - 1, i)) * (11 - i);
            Resto = (Soma * 10) % 11;
        }

        if ((Resto == 10) || (Resto == 11)) {
            Resto = 0;
        }
        if (Resto != Integer.parseInt(cpf.substring(9, 10))) {
            return false;
        }
        Soma = 0;
        for (int i = 1; i <= 10; i++) {
            Soma = Soma + Integer.parseInt(cpf.substring(i - 1, i)) * (12 - i);
        }
        Resto = (Soma * 10) % 11;

        if ((Resto == 10) || (Resto == 11)) {
            Resto = 0;
        }
        if (Resto != Integer.parseInt(cpf.substring(10, 11))) {
            return false;
        }
        return true;
    }
}
