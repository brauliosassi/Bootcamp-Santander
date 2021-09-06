package br.com.digital.innovation.one.aula2;

import java.util.function.Supplier;

public class Suplidores {
    public static void main(String[] args) {
        Supplier<Pessoa> suppliers = () -> new Pessoa();

        System.out.println(suppliers.get());
    }
}

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa() {
        nome = "Braulio";
        idade = 35;
    }

    @Override
    public String toString(){
        return String.format("nome :  %s, idade: %d", nome, idade);
    }
}