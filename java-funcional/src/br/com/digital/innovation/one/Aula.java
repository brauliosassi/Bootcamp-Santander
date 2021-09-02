package br.com.digital.innovation.one;

import java.util.function.UnaryOperator;

public class Aula {
    public static void main(String[] args){

        //Modo imperativo
        /*
        int valor = 10;
        int resultado = valor * 3;
        System.out.println("resultado é :: "+resultado); */

       //Modo funcional
        UnaryOperator<Integer> calculaValorVezesTrinta = valor -> valor * 3;
        int valor = 10;
        System.out.println("O resultado é :: "+calculaValorVezesTrinta.apply(  10));
    }
}
