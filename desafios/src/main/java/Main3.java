import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //declare as variaveis corretamente

        int combustivel = leitor.nextInt();
        double distancia  = leitor.nextDouble();

        double media = combustivel / distancia ;  //insira as variaveis de acordo com o enunciado
        System.out.printf("%.3f km/l ", media);
    }
}
