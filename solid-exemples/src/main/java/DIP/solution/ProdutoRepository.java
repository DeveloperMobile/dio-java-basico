package DIP.solution;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    public ProdutoRepository(DbConnection dbConnection) { }

    public List<Produto> buscarProdutos() {
        // Retorna a lista de produtos da base de dados
        return new ArrayList<>();
    }

    public void salvarProduto(Produto produto) {
        // Salva lista de produtos na base de dados
    }
}
