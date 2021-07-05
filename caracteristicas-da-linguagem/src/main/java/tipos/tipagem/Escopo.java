package tipos.tipagem;

public class Escopo {

    public static void main(String[] args) {
        final var escopo = new TesteDeEscopo();
        System.out.println("O número definido é: " + escopo);
    }

}

class TesteDeEscopo {
    int numeroMinimo;
    Integer Numeromaximo;

    /* public int defineNumeroMinimo(numeroMinimo){
        if (numeroMinimo > 10){
            this.numeroMinimo = numeroMinimo;
        }
        return  this.numeroMinimo;
    }

    public Integer defineNumeroMaximo(Integer numeroMaximo){
        return this.defineNumeroMinimo;
    }*/
}
