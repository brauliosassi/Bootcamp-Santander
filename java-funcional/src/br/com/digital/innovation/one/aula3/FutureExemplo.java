package br.com.digital.innovation.one.aula3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.collect;


public class FutureExemplo {
    public static final ExecutorService pessoasParaExecutarAtividade = Executors.newFixedThreadPool( 3);

    public static void main(String[] args) throws InterruptedException {
        Casa casa = new Casa(new Quarto());
        List<Future<String>> futuros =
        new CopyOnWriteArrayList<Future<String>>(casa.obterAfazeresDaCasa().stream()
                .map( atividade ->  pessoasParaExecutarAtividade.submit(() -> {
                    try {
                        return atividade.realizar();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return null;
                })

                )
                .collect(Collectors.toList()));


        while(true){
            int numeroDeAtividadesNaoFinalizadas = 0;
            for (Future<?> futuro : futuros) {
                if (futuro.isDone()){
                    try {
                        System.out.println("Parabéns você acabou sua tarefa!" +futuro.get());
                        futuros.remove(futuro);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }catch (ExecutionException e){
                        e.printStackTrace();
                    }
                }  else {
                    numeroDeAtividadesNaoFinalizadas++;
                }

                if (!futuros.stream().allMatch(Future::isDone)){
                    break;
                }
                System.out.println("Numero de atividade não finalizadas :: "+numeroDeAtividadesNaoFinalizadas);
                Thread.sleep(500);
            }
            pessoasParaExecutarAtividade.shutdown();
        }


    }

}

class Casa{
    private List<Comodo> comodos;

    Casa(Comodo... comodos) {this.comodos = Arrays.asList(comodos);}

    List<Atividade> obterAfazeresDaCasa(){
        return this.comodos.stream().map(Comodo::obterAfazeresDoComodo)
                .reduce(new ArrayList<Atividade>(), (pivo, atividade) -> {
                    pivo.addAll(atividade);
                    return pivo;
                });
    }
}

interface Atividade{
    String realizar() throws InterruptedException;
}

abstract class Comodo{
    abstract List<Atividade> obterAfazeresDoComodo();
}

class Quarto extends Comodo {
    @Override
    List<Atividade> obterAfazeresDoComodo(){
        return Arrays.asList (
                this::arrumar_a_cama,
                this::varrer_o_quarto,
                this::arrumar_o_guarda_roupa
        );
    }
    private String arrumar_o_guarda_roupa() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("arrumar o guarda roupa");
        return arrumar_o_guarda_roupa();
    }

    private String varrer_o_quarto() throws InterruptedException {
        Thread.sleep(7000);
        System.out.println("Varrer o quarto");
        return varrer_o_quarto();
    }

    private String arrumar_a_cama() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("Arruma a  cama.");
        return arrumar_a_cama();
    }
}