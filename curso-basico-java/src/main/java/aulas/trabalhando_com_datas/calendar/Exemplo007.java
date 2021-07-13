package aulas.trabalhando_com_datas.calendar;

import java.util.Calendar;

public class Exemplo007 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.printf("%tc\n", agora);
        // ter jul 13 17:38:43 BRT 2021
        System.out.printf("%tF\n", agora);
        // 2021-07-13
        System.out.printf("%tD\n", agora);
        // 07/13/21
        System.out.printf("%tr\n", agora);
        // 05:41:44 PM
        System.out.printf("%tT\n", agora);
        // 17:41:44
    }
}
