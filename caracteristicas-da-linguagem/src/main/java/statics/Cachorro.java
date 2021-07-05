package statics;
/*
 * Uma variável estática poderá ser acessada por todas as instâncias desta classe,
 * e quando seu conteúdo é modificado em uma instância, a modificação ocorre em todas as demais.
 * Nas declarações de métodos ajudam no acesso direto à classe, portanto não é necessáro
 * instanciar um objeto para acessar o mátodo.
 * */
public class Cachorro {
    // public String zoologia = "Quadrupede"; // Uma instãncia
    public static String zoologia = "Quadrupede"; // Todas as instâncias

    public static String late() {
        return "Au! Au!";
    }
}
