package aulas.trabalhando_com_datas.date;

import java.util.Date;

/**
 * Exemplo de utilização do construtor com passagem
 * de parâmetro em milisegundos
 */
public class Exempo002 {
    public static void main(String[] args) {
        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        // 1626203670522

        Date novaData = new Date(currentTimeMillis);
        System.out.println(novaData);
        // Tue Jul 13 16:15:01 BRT 2021
    }
}
