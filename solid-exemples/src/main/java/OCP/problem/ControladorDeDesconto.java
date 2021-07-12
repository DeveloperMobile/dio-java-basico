package OCP.problem;

public class ControladorDeDesconto {
    public void adicionaDescontoLivroInfantil(DescontoLivroInfantil descontoLivroInfantil) {
        descontoLivroInfantil.valorDescontoLivroInfantil();
    }

    public void adicionaDescontoLivroAutoAjuda(DescontoLivroAutoAjuda descontoLivroAutoAjuda) {
        descontoLivroAutoAjuda.valorDescontoLivroAutoAjuda();
    }

    public void adicionaDescontoLivroAcao(DescontoLivroAcao descontoLivroAcao) {
        descontoLivroAcao.descontoLivroAcao();
    }
}
