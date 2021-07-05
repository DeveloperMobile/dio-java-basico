package classes.pessoa;

public class ProgramaPessoaFisica {
    public static void main(String[] args) {
        final PessoaFisica pessoaFisica = new PessoaFisica(33, 5.100f);
        System.out.println(pessoaFisica.relatorio());
    }
}
