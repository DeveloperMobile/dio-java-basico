package ifs;

public class If {
    public static void main(String[] args) {
        final var condicao = true;

        if (condicao) {
            System.out.println("A Condição é Verdadeira");
        } else {
            System.out.println("A Condição é Falsa");
        }

        if (condicao)
            System.out.println("Uma única inha...");

        final var ternairo = condicao ? "é verdadeira" : "é falsa";
        System.out.println(ternairo);
    }
}
