package strings;

public class StringFormat {
    public static void main(String[] args) {
        var nome = "Tiago";
        var sobrenome = "Vieira";
        final var nomeCompleto = nome + " " + sobrenome;

        System.out.println(nome);
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Nome Completo do Cliente: " + nomeCompleto);
        final var mensagem = String.format("O Cliente %s possui sobrenome %s ", nome, sobrenome);
        System.out.println(mensagem);

        System.out.println(String.format("Número %.2f ", 1.2375d));
    }
}
