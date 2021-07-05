package classes.cliente;

public class ProgramaDoCliente {
    public static void main(String[] args) {
        final var cliente = new Cliente(18);
        cliente.getIdade();
        cliente.getPeso();

        //System.out.println(cliente.relatorio());

        /*
         * Cliente não ira conseguir acessar o relatório
         * pois esse é um método "protected" da classe Pessoa e
         * a classe Pessoa que é herdada pela classe "Cliente" está em outro pacote.
         * */
    }
}
