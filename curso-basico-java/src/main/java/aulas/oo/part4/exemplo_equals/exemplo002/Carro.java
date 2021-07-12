package aulas.oo.part4.exemplo_equals.exemplo002;

public class Carro extends Veiculo {
    private int quantidadeDePortas;

    public Carro(String modelo, String marca, double valorVental) {
        super(modelo, marca, valorVental);
    }

    public Carro(String modelo, String marca, double valorVental, int quantidadeDePortas) {
        super(modelo, marca, valorVental);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public double calculaImposto() {
        return this.getValorVental() * 0.07;
    }
}
