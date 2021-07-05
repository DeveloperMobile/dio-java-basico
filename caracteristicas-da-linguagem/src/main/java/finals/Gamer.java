package finals;

/* Quando aplicado o modificador "Final" em uma classe, não permite instância.
 * Nos métodos impede que o mesmo seja sobrescrito (overriding) na subclasse.
 * Nos valores de variáveis não pode ser alterado depois que já tenha sido atribuido um valor. */

public class Gamer {
    public String keyboard() { return "Keyboard Gamer!"; }
    public final String mouse() { return "Mouse Gamer!"; }
}
