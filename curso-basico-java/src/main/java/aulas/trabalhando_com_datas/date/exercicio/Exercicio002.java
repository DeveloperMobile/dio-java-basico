package aulas.trabalhando_com_datas.date.exercicio;

import java.util.Date;

public class Exercicio002 {
    public static void main(String[] args) {
        Date dataNascimento = new Date(496465200000L);
        System.out.println(dataNascimento);

        Date dataComparacao = new Date(1273951869075L);
        System.out.println(dataComparacao);

        /** Comparando se a dataNascimento é posterior a dataComparação */
        boolean isAfter = dataNascimento.after(dataComparacao);
        System.out.println(isAfter);

        /** Comparando se a dataNascimento é anterior a dataComparação */
        boolean isBefore = dataNascimento.before(dataComparacao);
        System.out.println(isBefore);
    }
}
