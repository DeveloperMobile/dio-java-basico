package SRP.solution;

import SRP.problem.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe OrdemDeCompta
 */
public class OrdemDeCompra {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    /*public BigDecimal calculaTotal() {
        return produtos.stream()
                .map(Produto::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }*/
}
