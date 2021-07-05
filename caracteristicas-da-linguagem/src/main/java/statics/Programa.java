package statics;

public class Programa {
    public static void main(String[] args) {
        final Cachorro pitbull = new Cachorro();
        pitbull.zoologia = "Bipede";
        // Ao alterar a zoologia de pitbull, todos os Cachorros terão a zoologia alterada porque foi definida como static

        final Cachorro viralatas = new Cachorro();

        System.out.println(pitbull.zoologia);
        System.out.println(viralatas.zoologia);
    }
}
