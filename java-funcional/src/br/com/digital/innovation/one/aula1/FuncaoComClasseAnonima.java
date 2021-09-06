package br.com.digital.innovation.one.aula1;

import br.com.digital.innovation.one.aula1.Funcao;

public class FuncaoComClasseAnonima {
    public static void main(String[] args){
        Funcao colocarprefixoSenhorNaString = new Funcao(){
            @Override
            public String gerar(String valor) {return "Sr. "+valor;}
        };
        System.out.println(colocarprefixoSenhorNaString.gerar("Joao"));
    }
}
