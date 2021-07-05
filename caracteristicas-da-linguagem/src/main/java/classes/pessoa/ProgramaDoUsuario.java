package classes.pessoa;

import classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {
    public static void main(String[] args) {
        final var batman = new SuperUsuario("batman", "123445$#@");
        System.out.println(batman.getLogin());
        //System.out.println(batman.getPsw()); // Erro. O método getSenha() da classe SuperUsuariio é protected
        //String nomeCliente = batman.nome; // Erro. a variavel 'nome' da classe SuperUsuario não é publica.
    }
}
