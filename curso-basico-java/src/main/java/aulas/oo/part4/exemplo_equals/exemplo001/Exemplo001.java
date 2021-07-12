package aulas.oo.part4.exemplo_equals.exemplo001;

public class Exemplo001 {
    public static void main(String[] args) {
        Veiculo carro1 = new Carro("Palio", "Fiat", 20000.0);
        Veiculo carro2 = new Carro("Palio", "Fiat", 20000.0);

        System.out.println(carro1.equals(carro2)); // false
    }
}
