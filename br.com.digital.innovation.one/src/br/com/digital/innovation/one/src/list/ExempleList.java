package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ExempleList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Braulio");
        nomes.add("Pedro");
        nomes.add("Aabrão");
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Tito");

        System.out.println(nomes);


        nomes.set(2, "troca Nome");
        System.out.println(nomes);

        nomes.remove(5);

        Collections.sort(nomes);
        System.out.println(nomes);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        boolean verificaNome = nomes.contains("Fernando");
        System.out.println(verificaNome);

        boolean listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);

        int posicao = nomes.indexOf("Braulio");
        System.out.println( posicao);

        for (String nomeDoItem: nomes){
            System.out.println(nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println("---> " +iterator.next());

        }

    }
}
