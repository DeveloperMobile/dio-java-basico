package aulas.trabalhando_com_datas.local_date;

import java.time.LocalDate;

public class Exemplo011 {
    public static void main(String[] args) {
        LocalDate hoje =  LocalDate.now();
        LocalDate ontem = hoje.minusDays(2);
        System.out.println(hoje);
        // 2021-07-13
        System.out.println(ontem);
        // 2021-07-11
    }
}
