package aulas.trabalhando_com_datas.date.exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio001 {
    public static void main(String[] args) {
        Exercicio001 e = new Exercicio001();
        System.out.println(e.stringToLong("14-07-2021")); // 496465200000
        e.checaLong(1563385317992L);
    }

    /**
     * Exercicio 1
     * Você tem um epoch (formato long) converta no formato Date
     * Epoch 1563385317992
     * Ponto de atenção: como você está manipulando um numero do tipo long, dependendo da maneira que você estiver
     * manipulando essa informação, você precisa colocar a letra l no final do numero
     * @param epoch
     * @return
     */
    public Date checaLong(long epoch) {
        Date date = new Date(epoch);
        System.out.println(date);
        return date;
    }

    public long stringToLong(String string_date) {
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date d = f.parse(string_date);
            return d.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return 0L;
    }
}
