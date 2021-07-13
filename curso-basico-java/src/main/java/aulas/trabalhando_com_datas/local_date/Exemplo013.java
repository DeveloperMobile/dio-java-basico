package aulas.trabalhando_com_datas.local_date;

import java.time.LocalTime;

public class Exemplo013 {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();
        System.out.println(agora);
        // 18:29:01.889476

        LocalTime maisUmaHora = agora.plusHours(1);
        System.out.println(maisUmaHora);
        // 19:29:01.889476
    }
}
