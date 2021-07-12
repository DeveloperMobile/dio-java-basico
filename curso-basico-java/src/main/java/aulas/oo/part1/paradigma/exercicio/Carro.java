package aulas.oo.part1.paradigma.exercicio;

public class Carro {
    private int qtdPessoa = 0;

    public int getQtdPessoa() {
        return qtdPessoa;
    }

    public void addPessoa(int qtdPessoa) {
        if (getQtdPessoa() <= 5) {
            if ((getQtdPessoa() + qtdPessoa) > 5) {
                System.out.println("Capacidade máxima atingida!");
            } else {
                this.qtdPessoa += qtdPessoa;
            }
        } else {
            System.out.println("Capacidade máxima atingida!");
        }
    }

    public void removePessoa(int qtdPessoa) {
        if (getQtdPessoa() > 0) {
            if ((getQtdPessoa() - qtdPessoa) < 1) {
                System.out.println("O carro está vazio...");
            } else {
                this.qtdPessoa -= qtdPessoa;
            }
        } else {
            System.out.println("O carro está vazio...");
        }
    }
}
