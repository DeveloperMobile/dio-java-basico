package aulas.trabalhando_com_datas.calendar;

import java.util.Calendar;

/**
 * Exemplo de utilização da classe Calendar
 */
public class Exemplo006 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println("A data corrent é: " + agora.getTime());
        // A data corrent é: Tue Jul 13 17:31:13 BRT 2021

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + agora.getTime());
        // 15 dias atrás: Mon Jun 28 17:32:20 BRT 2021

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 messes depois: " + agora.getTime());
        // 4 meses depois: Thu Oct 28 17:33:44 BRT 2021

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());
        // 2 anos depois: Sat Oct 28 17:34:29 BRT 2023
    }
}
