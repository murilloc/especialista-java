import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens;

    void adicionarItem(ItemCardapio item) {

        if (itens == null) {
            itens = new ItemCardapio[0];
        }
        itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = item;

    }

    void removerItem(int indice) {

        ItemCardapio[] novoItens = new ItemCardapio[itens.length - 1];
        System.arraycopy(itens, 0, novoItens, 0, indice);
        System.arraycopy(itens, indice + 1, novoItens, indice, novoItens.length - indice);
        itens = novoItens;
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {

        if (itens == null) {
            System.out.println("Não há items para impressão");
            return;
        }

        for (ItemCardapio item : itens) {
            if (item.preco >= precoMinimo && item.preco <= precoMaximo) {
                System.out.printf("- %s: %.2f%n", item.descricao, item.preco);
            }
        }

    }

}
