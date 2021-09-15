package br.com.digital.innovation.one.aula6;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

import static jdk.internal.org.jline.utils.Colors.s;

public class clientHttpExemplo {

    static ExecutorService executor = Executors.newFixedThreadPool(6, ThreadFactory() {
        @Override
        public Thread newThread((Runnable runnable) {
            Thread thread = new Thread(runnable);
            System.out.println("Nova thread criada"+(newThread.isDaemon() ? "daemon" : "")+ "Thread Group :: "+ newThread.getThreadGroup());
             return thread;
        }
    });
    public static void main(String[] args) throws IOException, InterruptedException {
        connectAndPrintURLJavaOracle();
        
    }

    private static void connectAkamaiHttpClient(){
        System.out.println("Running HTTP/1.1 exemple....");
        try {
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1)
                    .proxy(ProxySelector.getDefault())
                    .build();

            long start = System.currentTimeMillis();

            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();

            HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status code::: "+response.statusCode());
            System.out.println("Status code::: "+response.headers());
            String responseBody = response.body();
            System.out.println(responseBody);


            List<Future<?>> future = new ArrayList<>();

            responseBody
                    .lines()
                    .filter(line -> line.trim().startsWith("img heigth"))
                    .map(line -> line.substring(line.indexOf("src ")+ 5, line.indexOf("'/>'")))
                    .forEach(image -> System.out.println(image));



        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void connectAndPrintURLJavaOracle() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://docs.oracle.com/javase/10/language/"))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status code: "+response.statusCode());
        System.out.println("Status code: "+response.headers());
        System.out.println(response.body());

    }


}
