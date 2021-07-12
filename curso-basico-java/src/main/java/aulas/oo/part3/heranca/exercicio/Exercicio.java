package aulas.oo.part3.heranca.exercicio;

public class Exercicio {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        System.out.println(gerente.getSalario());

        Supervisor supervisor = new Supervisor();
        System.out.println(supervisor.getSalario());

        Atendente atendente = new Atendente();
        System.out.println(atendente.getSalario());

        System.out.println(gerente.calculoImposto());
        System.out.println(supervisor.calculoImposto());
        System.out.println(atendente.calculaImposto());


    }
}
