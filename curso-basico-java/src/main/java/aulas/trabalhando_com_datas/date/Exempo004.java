package aulas.trabalhando_com_datas.date;

import java.util.Date;

/**
 * Exemplo de utilização dos métodos compareTo e equals
 */
public class Exempo004 {
    public static void main(String[] args) {
        Date dataNoPassado = new Date(1513124807691L); // Tue Dec 12 21:26:47 BRT 2017
        Date dataNoFuturo = new Date(1613124807691L); // Fri Feb 12 07:13:27 BRT 2021
        Date mesmaDataNoFuturo = new Date(1613124807691L); // Fri Feb 12 07:13:27 BRT 2021

        /** Comparando se as datas são iguais */
        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);
        System.out.println(isEquals); // true

        /** Comparando uma data com a outra */
        int comapreCase1 = dataNoPassado.compareTo(dataNoFuturo); // passado -> futuro
        int comapreCase2 = dataNoFuturo.compareTo(dataNoPassado); // futuro -> passado
        int comapreCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo); // datas equivalentes

        System.out.println(comapreCase1); // -1
        System.out.println(comapreCase2); // 1
        System.out.println(comapreCase3); // 0
    }
}
