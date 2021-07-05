package classes.usuario;

public class ProgramaDoSuperUsuario {
    public static void main(String[] args) {
        final var superUsuario = new SuperUsuario("root", "12345");
        System.out.println(superUsuario.getLogin());
        System.out.println(superUsuario.getPsw());

        String root = superUsuario.nome;
        System.out.println(root);
        System.out.println(superUsuario.nome);
    }
}
