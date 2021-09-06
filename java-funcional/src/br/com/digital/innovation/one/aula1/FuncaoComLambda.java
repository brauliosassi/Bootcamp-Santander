package br.com.digital.innovation.one.aula1;

import br.com.digital.innovation.one.aula1.Funcao;

public class FuncaoComLambda {
    public static void main(String[] args){
        Funcao colocarPrefixoSenhorNaString = valor -> "Sr. "+valor;
        System.out.println(colocarPrefixoSenhorNaString.gerar("João"));
    }
}
