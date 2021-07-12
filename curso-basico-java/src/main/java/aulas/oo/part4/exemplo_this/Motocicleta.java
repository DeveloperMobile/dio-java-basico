package aulas.oo.part4.exemplo_this;

public class Motocicleta extends Veiculo {
    private String cilindaradas;

    public String getCilindaradas() {
        return cilindaradas;
    }

    public void setCilindaradas(String cilindaradas) {
        this.cilindaradas = cilindaradas;
    }

    @Override
    public double calculaImposto() {
        return this.getValorVental() * 0.03;
    }
}
