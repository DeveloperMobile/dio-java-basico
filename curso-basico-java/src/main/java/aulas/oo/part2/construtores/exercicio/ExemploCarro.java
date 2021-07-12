package aulas.oo.part2.construtores.exercicio;

public class ExemploCarro {
    public static void main(String[] args) {
        var carro = new Carro("Ford", "KA", 2009);
        System.out.println(carro);

        carro.setVariante("Variant II");
        System.out.println(carro);
    }
}
