package interfaces;
/*
 * Interface é como um contrato que quando assumido por outra classe deve ser implementado.
 * Métodos abstratos devem ser implementados por todos.
 * Novos métodos quebram as implementações.
 * Métodos default são herdados a todos que implementam.
 * Novos métodos não quebram as implementações.
 * Em Java não permite herança multipla de classes, mas é possível multipla herança de interface.
 * */
public interface Carro extends Automovel {
    String marca();
    //Double valor();

    default void ligar() {
        System.out.println("Licando o carro!");
    }

    default String codigoRenavan() {
        return "6533JIJIO";
    }
}
