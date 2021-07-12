package DIP.problem;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    private MySqlConnection mySqlConnection;

    public ProdutoRepository(MySqlConnection mySqlConnection) {
        this.mySqlConnection = mySqlConnection;
    }

    public List<Produto> buscarProdutos() {
        // Retorna a lista de produtos da base de dados
        return new ArrayList<>();
    }

    public void salvarProduto(Produto produto) {
        // Salva lista de produtos na base de dados
    }
}
