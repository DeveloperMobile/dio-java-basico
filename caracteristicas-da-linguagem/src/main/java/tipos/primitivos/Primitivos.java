package tipos.primitivos;

public class Primitivos {

    public static void main(String[] args) {
        //TIPOS CARACTERES -------

        //caracteres = 16 bits
        char c;
        char c1 = 'A';
        char c2 = 15;
        //char c3 = 'AA'; //NOK
        //char c4 = -100; //NOK

        //TIPOS INTEIROS -------

        //byte nullByte = null;
        //bytes = 8 bits range = -128 até 127

        byte b;
        byte b1 = 127;
        byte b2 = -128;
        //byte b3 = 129; //to large

        //short = 16 bits
        //range = -32768 até 32767
        short s;
        short s1 = 32767;
        short s2 = -32768;

        //inteiro = 32bits
        //range = -2147483648 até 2147483647
        int i = 2147483647;
        int i2 = -2147483648;
        //int i3 = -2147483649; //to large

        //longo = 64bits
        //range = -9223372036854775808l até 9223372036854775807l
        long l = 9223372036854775807l;
        long l1 = -9223372036854775808l;
        //long l3 = 9223372036854775808l; // to large

        //TIPOS FLUTUANTES -------

        //float = 32bits
        //range = 3.402,823,5 E+38
        float f = 65f;
        float f2 = 65.0f;
        float f3 = -0.65f;

        //double = 64bits
        //range = 1.797,693,134,862,315,7 +E368
        double d = 1024.99;
        double d1 = 10.2456;

        //TIPOS BOOLEANO -------

        boolean bo = true;
        boolean bo2 = false;
        //boolean bo3 = "false"; //NOK
        //boolean bo4 = "true"; //NOK

        //void v; //palavra reservada

        //System.out.println("byte : " +b); //ERROR A variavel b não foi inicializada
    }
}
