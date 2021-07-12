package aulas.oo.part4.exemplo_this;

public class Carro extends Veiculo {
    private int quantidadeDePortas;

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
