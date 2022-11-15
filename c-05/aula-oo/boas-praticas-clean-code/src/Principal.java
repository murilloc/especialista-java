public class Principal {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.ativar();
        produto.nome = "Água";
        produto.precoUnitario = 5.0;



        Endereco endereco = new Endereco();
        endereco.logradouro = "Avenida Pres. Vargas";
        endereco.numero = "1002";
        endereco.bairro = "Centro";

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem(produto, 2);

        carrinho.gerarPedido();

        System.out.println("Pedido gerado");

    }

}
