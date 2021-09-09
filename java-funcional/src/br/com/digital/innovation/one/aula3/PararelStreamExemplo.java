package br.com.digital.innovation.one.aula3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static br.com.digital.innovation.one.aula1.FatorialRecursivo.FatorialRecurssivo.fatorial;

public class PararelStreamExemplo {

    public static long main(String[] args) {
//        long inicio = System.currentTimeMillis();
//        IntStream.range(1, 100000).forEach(num -> fatorial(num));
//        long fim = System.currentTimeMillis();
//
//        System.out.println("tempo de execução serial :: "+(fim - inicio));
//
//         inicio = System.currentTimeMillis();
//        IntStream.range(1, 100000).forEach(num -> fatorial(num));
//         fim = System.currentTimeMillis();
//
//        System.out.println("tempo de execução paralela :: "+(fim - inicio));

        List<String> nomes = Arrays.asList("João", "Lula", "Bolsonaro", "Sérgio Mouro", "Trump");
        nomes.parallelStream().forEach(System.out::println);

//        public static long fatorial(long num){
//              fat = 1;
//
//            for (long i = 2; i <= num; i++) {
//                fat *= i;
//            }
//            return fat;
//        }
        return 0;
    }
}
