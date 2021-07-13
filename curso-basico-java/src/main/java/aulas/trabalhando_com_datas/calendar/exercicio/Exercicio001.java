package aulas.trabalhando_com_datas.calendar.exercicio;

import java.util.Calendar;

public class Exercicio001 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1626231600000L);
        System.out.println("Data corrente: " + calendar.getTime());

        calendar.add(Calendar.DATE, 10);

        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SATURDAY: {
                calendar.add(Calendar.DATE, 2);
                System.out.println("Data Vencimento: " + calendar.getTime());
                break;
            }
            case Calendar.MONDAY: {
                calendar.add(Calendar.DATE, 1);
                System.out.println("Data Vencimento: " + calendar.getTime());
                break;
            }
            default: {
                System.out.println("Data do Vencimento: " + calendar.getTime());
                break;
            }
        }


    }
}
