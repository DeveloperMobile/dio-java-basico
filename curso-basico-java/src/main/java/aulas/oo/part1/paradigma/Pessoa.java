package aulas.oo.part1.paradigma;

public class Pessoa {
    private String nome = "Tiago";

    public String getNome() {
        return nome;
    }

    public String falarMeuProprioNome() {
        return "Olá, meu nome é " + getNome();
    }

    public String andar() {
        return "Andando...";
    }
}
