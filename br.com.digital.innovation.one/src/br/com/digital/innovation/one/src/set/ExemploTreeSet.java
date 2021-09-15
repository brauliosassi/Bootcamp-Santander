package set;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        //Monta a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo horizonte");

        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo
        System.out.println(treeCapitais.first());

        //Retorna a primeira capital a última
        System.out.println(treeCapitais.last());

        //Retorna a primeira capital abaixo da árvore parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        //Retorna a primeira capital acima da árvore parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        //Retorna a primeira capital do topo da árvore
        System.out.println(treeCapitais.pollFirst());

        //Retorna a primeira capital do fim da árvore
        System.out.println(treeCapitais.pollLast());




    }
}
