package classes.pessoa;

/*
 * Desenvolvimento básico em Java - Digital Innovatiion One
 * Classe criada para exemplificar modificadores de acesso.
 **/

public class Pessoa {
    private Integer idade;
    private Float peso;

    public Pessoa(Float peso) {
        this.peso = peso;
    }

    public Pessoa(final Integer idade)  {
        this.idade = idade;
    }

    public Pessoa(final Integer idade, final Float peso) {
        this.idade = idade;
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public Float getPeso() {
        return peso;
    }

    protected String relatorio() {
        return "Idade: " + idade + " e Peso: " + peso;
    }
}
