package aulas.oo.part3.heranca.exercicio;

public class Supervisor extends Funcionario {
    public double calculoImposto() {
        return getSalario() * 0.05;
    }
}
