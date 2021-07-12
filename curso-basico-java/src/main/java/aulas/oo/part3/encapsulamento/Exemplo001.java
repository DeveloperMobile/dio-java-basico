package aulas.oo.part3.encapsulamento;

public class Exemplo001 {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa("Tiago", 25, 9, 1985);

        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calculaIdade());

        eu.setNome("Tiago Vieira");

        System.out.println(eu.getNome());
    }
}
