package aulas.oo.part4.exemplo_equals.exemplo001;

public abstract class Veiculo {
    private String modelo;
    private String marca;
    private double valorVental;

    public Veiculo(String modelo, String marca, double valorVental) {
        this.modelo = modelo;
        this.marca = marca;
        this.valorVental = valorVental;
    }

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
