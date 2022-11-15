import java.util.Objects;

public class CarrinhoDeCompras {


    //void adicionarItem(String produto, double precuUnitario, int quantidade){}

    void adicionarItem(Produto produto, int quantidade) {

        Objects.requireNonNull(produto, "Produto dever ser informado");

        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que 0");
        }
        System.out.printf("Produto: %s -- %d%n", produto.nome, quantidade);
        // TODO
    }

    void gerarPedido(Endereco endereco) {
        Objects.requireNonNull(endereco, "Endereço deve ser informado");

        criarNovoPedido(endereco);
    }

    // argumento opcional
    void gerarPedido() {
        criarNovoPedido(null);
    }

    private void criarNovoPedido(Endereco enderecoEntrega) {
        //TODO
    }

}
