package aulas.oo.part3.heranca.exemplo003;

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
        return this.getValorVenal() * 0.07;
    }
}
