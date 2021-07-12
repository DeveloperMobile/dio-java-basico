package aulas.oo.part3.heranca.exercicio;

public class Gerente extends Funcionario {
    public double calculoImposto() {
        return getSalario() * 0.1;
    }
}
