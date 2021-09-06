package br.com.digital.innovation.one.aula2;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo SOMA = (a, b) -> a+b;
        Calculo SUBTRACAO = (a, b) -> a-b;
        Calculo MULTIPLICAO = (a, b) -> a*b;
        Calculo DIVISAO = (a, b) -> a/b;

        System.out.println(executarOperacao(SOMA, 1, 3));
        System.out.println(executarOperacao(SUBTRACAO, 4, 3));
        System.out.println(executarOperacao(MULTIPLICAO, 7, 3));
        System.out.println(executarOperacao(DIVISAO, 4, 2));
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);
    }
    @FunctionalInterface
    interface Calculo{
        public int calcular(int a, int b);
    }
}
