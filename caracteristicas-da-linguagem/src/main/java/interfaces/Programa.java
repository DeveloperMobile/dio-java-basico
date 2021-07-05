package interfaces;

public class Programa {
    public static void main(String[] args) {
        final Gol gol = new Gol();
        System.out.println("Marca do Gol: " + gol.marca());
        gol.ligar();

        final Veiculo trator = new Trator();
        System.out.println("Registro do Trator: " + trator.registro());
        trator.ligar();

        // final Carro fiesta = new Fiesta(); // Se definir o tipo Fiesta vai quebrar pq Carro não implementa registro.
        // final Veiculo fiesta = new Fiesta(); // Se definir o tipo Veiculo vai quebrar pq Veiculo não implementa marca.

        final Fiesta fiesta = new Fiesta(); // Nesse caso tem que utilizar o próprio tipo "fiesta"
        System.out.println("Marca do Fiesta: " + fiesta.marca());
        System.out.println("Registro do Fiesta: " + fiesta.registro());

        fiesta.ligar(); // Vai imprimir os dois métodos do carro e do veiculo pois a classe fiesta implementa os dois.

        // Carro.super.ligar(); // Só pode ser acessado por quem implementa
    }
}
