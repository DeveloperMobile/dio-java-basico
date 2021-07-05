package finals;

public class Programa {
    public static void main(String[] args) {
        final HardcoreGamer hardcoreGamer = new HardcoreGamer();
        final Gamer gamer = new Gamer();
        final CasualGamer casualGamer = new CasualGamer();
        final var game = "PUBG";

        //game = "WoW"; // Não deixa mudar o valor da variável porque é final.
        System.out.println(casualGamer.play(game));
    }
}
