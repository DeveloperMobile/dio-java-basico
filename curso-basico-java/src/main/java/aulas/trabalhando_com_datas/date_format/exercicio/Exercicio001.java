package aulas.trabalhando_com_datas.date_format.exercicio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio001 {
    public static void main(String[] args) {
        Date agora = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss:mmm");
        String dataFormatada = formatter.format(agora);
        System.out.println(dataFormatada);
    }
}
