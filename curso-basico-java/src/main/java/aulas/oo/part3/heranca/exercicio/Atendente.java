package aulas.oo.part3.heranca.exercicio;

public class Atendente extends Funcionario {
    public double calculaImposto() {
        return getSalario() * 0.01;
    }
}
