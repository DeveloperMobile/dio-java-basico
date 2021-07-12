package aulas.oo.part3.heranca.exemplo003;

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
        return this.getValorVenal() * 0.03;
    }
}
