package br.com.digital.innovation.one.aula3;

public class ThreadExemplo {
    public static void main(String[] args) {
        BarraDeCarregamento2 barraDeCarregamento2 = new BarraDeCarregamento2();
        BarraDeCarregamento3 barraDeCarregamento3 = new BarraDeCarregamento3();

        barraDeCarregamento2.start();
        barraDeCarregamento3.start();

    }
}

class GerarPDF implements Runnable{
    @Override
    public void run() {
        System.out.println("Gerar PDF");
    }
}

class BarraDeCarregamento implements Runnable{
    @Override
    public void run(){System.out.println("Loading....");}
}

class BarraDeCarregamento2 extends Thread{
    @Override
    public void run(){
        super.run();
        System.out.println("rodei" + this.getName());

        try {
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}

class BarraDeCarregamento3 extends Thread{
    @Override
    public void run(){
        super.run();
        System.out.println("rodei barra de carregamento 3" + this.getName());

        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}