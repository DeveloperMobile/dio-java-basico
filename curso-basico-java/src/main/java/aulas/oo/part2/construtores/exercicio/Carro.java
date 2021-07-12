package aulas.oo.part2.construtores.exercicio;

public class Carro {
    private String marca;
    private String modelo;
    private Integer ano;
    private String variante;

    public Carro(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", variante='" + variante + '\'' +
                '}';
    }
}
