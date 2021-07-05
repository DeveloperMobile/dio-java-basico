package finals;

public class CasualGamer extends Gamer {
    @Override
    public String keyboard() {
        return super.keyboard();
    }

    // Não pode sobrescrever o método mouse pois é final.
    /*@Override
    public String mouse() {
        return super.mouse();
    }*/

    public String play(final String game) {
        return "jogando " + game;
    }
}
