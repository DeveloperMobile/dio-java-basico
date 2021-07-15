import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int count = 0;
        double valor = 0.0;

        for (int i = 0; i < 6; i++) {
            valor = scanner.nextDouble();
            if (valor > 0) {
                count++;
            }
            valor = 0.0;
        }

        //System.out.println(valores.length);
        System.out.println(count + " valores positivos");
    }
}
