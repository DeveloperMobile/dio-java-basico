package interfaces;

public class Gol implements Carro {
    @Override
    public String marca() {
        return "Volkswagem";
    }
    // Não é preciso sobrescrever o método default, ele é herdado.
}
