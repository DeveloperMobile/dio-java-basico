package tipos.wrappers;

/*
* Wrappers são objetos que representam os primitivos
* Auto-boxing e Unboxing
* */

public class Wrappers {
    public static void main(String[] args) {
        //Autoboxing
        /* Não é necessário dar um "new" nesta classe.
         * Segue as mesmas regras dos primitivos.
         * Por ser um objeto consigo atribuir valor nulo.
         * */

        Byte b = 127; //byte com b "maiusculo" por que é uma classe.
        Byte b2 = -128;
        Byte nullByte = null;

        Character c = 'A';
        Character c2 = 15;

        Short s = 32767; //short
        Short s2 = -32768;

        Integer i = 2147483647; //int
        Integer i2 = -2147483648;

        Long l = 9223372036854775807l; //long
        Long l2 = -9223372036854775808l;

        Float f = 65f; //float
        Float f2 = 65.0f;
        Float f3 = -0.65f;

        Double d = 1024.99; //double
        Double d1 = 10.2456;

        Boolean bo = true; //boolean
        Boolean bo2 = false;

        //por ser um objeto possuem metodos.
        Boolean bo3 = Boolean.parseBoolean("false"); //OK
        Boolean bo4 = Boolean.valueOf("true"); //OK
    }
}
