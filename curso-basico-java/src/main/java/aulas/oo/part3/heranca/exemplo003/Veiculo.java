package aulas.oo.part3.heranca.exemplo003;

public class Veiculo {
    private String modelo;
    private String marca;
    private Double valorVenal;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValorVenal() {
        return valorVenal;
    }

    public void setValorVenal(Double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public void acelera() {
        System.out.println("Acelerando...");
    }

    public double calculaImposto() {
        return this.valorVenal * 0.01;
    }
}
