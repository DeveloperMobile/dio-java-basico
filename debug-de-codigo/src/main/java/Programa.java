import imc.CalculadorDeImc;
import pessoa.Pessoa;

public class Programa {
    public static void main(String[] args) {
        final var pessoa = new Pessoa("Tiago", 1.74, 85.0);
        final var calculadorDeImc = new CalculadorDeImc();
        final var imc = calculadorDeImc.calcula(pessoa);
        System.out.printf("IMC = %.2f", imc);
    }
}
