package aulas.oo.part1.paradigma.exercicio;

public class ProgramaCarro {
    public static void main(String[] args) {
        var carro = new Carro();

        int qtd = carro.getQtdPessoa();
        System.out.println(qtd);

        carro.addPessoa(3);
        qtd = carro.getQtdPessoa();
        System.out.println(qtd);

        carro.addPessoa(6);
        qtd = carro.getQtdPessoa();
        System.out.println(qtd);

        carro.removePessoa(2);
        qtd = carro.getQtdPessoa();
        System.out.println(qtd);

        carro.removePessoa(2);
        qtd = carro.getQtdPessoa();
        System.out.println(qtd);
    }
}
