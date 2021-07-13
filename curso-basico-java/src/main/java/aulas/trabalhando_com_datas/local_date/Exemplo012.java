package aulas.trabalhando_com_datas.local_date;

import java.time.LocalTime;

/**
 * Exemplo de como utilizar LocalTime */
public class Exemplo012 {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();
        System.out.println("Hora Atual: " + agora);
        // Hora Atual: 18:27:08.375993
    }
}
