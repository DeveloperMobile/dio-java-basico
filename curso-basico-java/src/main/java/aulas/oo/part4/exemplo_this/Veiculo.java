package aulas.oo.part4.exemplo_this;

public class Veiculo {
    private String modelo;
    private String marca;
    private double valorVental;

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

    public double getValorVental() {
        return valorVental;
    }

    public void setValorVental(double valorVental) {
        this.valorVental = valorVental;
    }

    public void acelera() {
        System.out.println("Acelerando");
    }

    public double calculaImposto() {
        return this.valorVental * 0.01;
    }
}
