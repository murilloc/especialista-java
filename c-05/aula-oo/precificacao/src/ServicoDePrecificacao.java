public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {

        double precoVendaCalculado = Matematica.calcularAcrescimo(produto.precoCusto, percentualMargemLucro);
        produto.precoVenda = Produto.custoEmbalagem + precoVendaCalculado;
    }

}
