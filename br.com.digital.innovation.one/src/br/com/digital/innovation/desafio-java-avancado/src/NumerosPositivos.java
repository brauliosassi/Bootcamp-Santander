import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        int numPos = 0;
        int cont = 0;

        while (cont < 3){
            float x = leitor.nextFloat();
            if (x > 0.0) {
                numPos++;
            }
            cont++;
        }
        System.out.println(""+numPos+ " valores positivos");

    }

}

