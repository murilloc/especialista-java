public class Produto {

    static double custoEmbalagem;

    double precoCusto;
    double precoVenda;

    void alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    static void imprimirCustoEmbalagem() {
        System.out.printf("Custo com embalagem: %.2f%n", Produto.custoEmbalagem);
    }

    static void alterarCustoEmbalagem(double novoCustoEmbalagem) {
        Produto.custoEmbalagem = novoCustoEmbalagem;

    }

    static double calcularCustosTotais(Produto produto) {
        return produto.precoCusto + Produto.custoEmbalagem;
    }

}
