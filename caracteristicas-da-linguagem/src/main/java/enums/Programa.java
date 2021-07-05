package enums;

public class Programa {
    public static void main(String[] args) {
        //final TipoVeiculo tipoVeiculo = new TipoVeiculo(); // Não é possível estanciar um Enum

        System.out.println(TipoVeiculo.TERRESTRE);
        System.out.println(TipoVeiculo.AQUATICO);

        //System.out.println(TipoVeiculo.valueOf("aereo")); // Para construir um enum apatrir de um valor tem que utilizar "MAIUSCULOS"

        for (TipoVeiculo tipo : TipoVeiculo.values()) {
            System.out.println("Tipo: " + tipo);
        }

        System.out.println("Código do Status CLOSE: " + Status.CLOSE.getCode());
        System.out.println("Texto do Status OPEN: " + Status.OPEN.getTexto());
    }
}

