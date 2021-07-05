package classes.pessoa;

import classes.cliente.Cliente;

public class ProgramaDoCliente {
    public static void main(String[] args) {
        final var cliente = new Cliente(18);
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Peso: " + cliente.getPeso());
        System.out.println(cliente.relatorio());
    }
}
