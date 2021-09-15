package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {

        Set<Integer> sequencianumerica = new LinkedHashSet<>();

        sequencianumerica.add(1);
        sequencianumerica.add(16);
        sequencianumerica.add(2);
        sequencianumerica.add(8);
        sequencianumerica.add(4);
        sequencianumerica.add(7);
        sequencianumerica.add(3);
        sequencianumerica.add(32);

        System.out.println(sequencianumerica);

        //Remove a nota do set
        sequencianumerica.remove(4);
        System.out.println(sequencianumerica);

        //Retorna a quantidade de itens
        System.out.println(sequencianumerica.size());

        //Navega em todos os itens do set
        Iterator<Integer> iterator = sequencianumerica.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer numero: sequencianumerica) {
            System.out.println(numero);
        }

        sequencianumerica.clear();

        System.out.println(sequencianumerica);

        //Retorna se o set está vazio
        System.out.println(sequencianumerica.isEmpty());

    }
}
