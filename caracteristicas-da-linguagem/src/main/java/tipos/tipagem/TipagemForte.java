package tipos.tipagem;

/*
* Java é considerado uma linguagem de tipagem forte porque uma vez definido o tipo de uma variavel
* a mesma não aceita outro tipo de dados.
* */

public class TipagemForte {

    public static void main(String[] args) {

        String texto = "meu texto";

        //texto = 1000; // NOK não deixa alterar o tipo de variável

        Integer numero = Integer.valueOf("1024");

        numero = 512; //OK
    }

}
