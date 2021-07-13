package aulas.trabalhando_com_datas.date;

import java.util.Date;

/**
 * Exemplo de utilização dos métodos after e before */
public class Exempo003 {
    public static void main(String[] args) {
        Date dataNoPassado = new Date(1513124807691L);
        // Tue Dec 12 21:26:47 BRST 2017

        Date dataNoFuturo = new Date(1613124807691L);
        // Fri Feb 12 07:13:27 BRT 2021

        /** Comparando se a dataNoPassado é posterior a dataNoFuturo */
        boolean isAfter = dataNoPassado.after(dataNoFuturo);
        System.out.println(isAfter);
        // false

        /** Comparando se a dataNoPassado é anterior a dataNoFuturo */
        boolean isBefore = dataNoPassado.before(dataNoFuturo);
        System.out.println(isBefore);
        // true
    }
}
