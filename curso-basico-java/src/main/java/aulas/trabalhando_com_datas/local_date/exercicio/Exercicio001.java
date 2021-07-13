package aulas.trabalhando_com_datas.local_date.exercicio;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exercicio001 {
    public static void main(String[] args) {
        LocalDateTime atual = LocalDateTime.now();
        System.out.println("Data Hora atual: " + atual);

        LocalDateTime futuro = atual.plusHours(13).plusYears(4).plusMonths(6);
        System.out.println("Data Hora para 4 anos, 6 meses 3 13 horas da data atual: " + futuro);
    }
}
