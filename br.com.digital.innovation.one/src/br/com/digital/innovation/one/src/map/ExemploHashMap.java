package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {

        Map<String, Integer> campeoesMundiais = new HashMap<>();

        //Adiciona os campeões mundiais FIFA no mapa e a qtde de títulos
        campeoesMundiais.put("Brasil", 5);
        campeoesMundiais.put("Alemanha", 4);
        campeoesMundiais.put("Itália", 4);
        campeoesMundiais.put("Uruguai", 2);
        campeoesMundiais.put("Argentina", 2);
        campeoesMundiais.put("França", 2);
        campeoesMundiais.put("Inglaterra", 1);
        campeoesMundiais.put("Espanha",1);

        System.out.println(campeoesMundiais);

        //Atualiza o valor para a chave Brasil
        campeoesMundiais.put("Brasil", 6);
        System.out.println(campeoesMundiais);

        //Retorna Argentina
        System.out.println(campeoesMundiais.get("Argentina"));

        //Retorna se existe ou não um campeão França
        System.out.println(campeoesMundiais.containsKey("França"));

        //Remove o campeão França
        campeoesMundiais.remove("França");
        System.out.println(campeoesMundiais);

        //Retorna se existe ou não Campeão França
        System.out.println(campeoesMundiais.containsKey("França"));

        //Retorna se existe um hexacampeão
        System.out.println(campeoesMundiais.containsKey(6));

        //Retorna o tamanho do mapa
        System.out.println(campeoesMundiais.size());

        System.out.println(campeoesMundiais);

        //Navega nos registros
        for (Map.Entry<String, Integer> entry : campeoesMundiais.entrySet()){
            System.out.println(entry.getKey()+ "--" +entry.getValue());
        }

        for (String key : campeoesMundiais.keySet()) {
            System.out.println(key + "--" +campeoesMundiais.get(key));
        }
        System.out.println(campeoesMundiais);

        //Verifica se tem um campeão EUA
        System.out.println(campeoesMundiais.containsKey("Estados Unidos"));

        //Verifica se tem valor 5
        System.out.println(campeoesMundiais.containsValue(5));

        //Verifeca o tamanho e depois limpa
        System.out.println(campeoesMundiais.size());
        campeoesMundiais.clear();
        System.out.println(campeoesMundiais.size());




    }
}
