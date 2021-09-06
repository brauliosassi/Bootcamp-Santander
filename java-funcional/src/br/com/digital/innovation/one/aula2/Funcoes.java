package br.com.digital.innovation.one.aula2;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornnarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiro = string -> Integer.valueOf(string);
        System.out.println(retornnarNomeAoContrario.apply("braulio"));
        System.out.println(converterStringParaInteiro.apply("20"));
    }
}
