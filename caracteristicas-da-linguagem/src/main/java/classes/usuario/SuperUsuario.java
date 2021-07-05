package classes.usuario;

public class SuperUsuario {
    private String login;
    private String psw;
    String nome;

    public SuperUsuario(final String login, final String psw) {
        this.login = login;
        this.psw = psw;
    }

    public String getLogin() {
        return login;
    }

    protected String getPsw() {
        return psw;
    }
}
