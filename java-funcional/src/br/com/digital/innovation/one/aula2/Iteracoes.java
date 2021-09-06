package br.com.digital.innovation.one.aula2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes  {
    public static void main(String[] args) {
        String[] nomes = {"João", "Sássi", "Braulio", "Java"};
        Integer[] numeros = {1,2,3,4};
//        imprimirNomesFiltrados(nomes);
        imprimirTodosNomes(nomes);
    }
    /**
    private static void imprimirNomesFiltrados(String... nomes) {
        String nomesParaImrimir = "";
        for( int i = 0; i < nomes.length; i++ ){
            if (nomes[i].equals("Braulio")){
                nomesParaImrimir += ""+nomes[i];
            }
        }

        System.out.println("Nomes do for: "+nomesParaImrimir);

        String nomesParaImprimirStream = Stream.of(nomes)
                        .filter(nome -> nome.equals("Braulio"))
                                .collect(Collectors.joining());

        System.out.println("Nomes do Stream: "+nomesParaImprimirStream);
    }

    String nomesResultados = Stream.of(nomes).filter(nome -> nome.equals("Braulio"))
            .collect(Collectors.joining());
    System.out.println(nomesResultados);
     */

    public static void imprimirTodosNomes(String... nomes){
        for(String nome : nomes) {
            System.out.println("Imprimido pelo for: "+nome);
        }
        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimido pelo forEach: "+nome));
    }
    public static void imprimiODobroDeCadaItemDaLista(Integer... numeros){
        for (Integer numero: numeros) {
            System.out.println(numero*2);
        }
    }
}
