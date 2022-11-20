import java.util.ArrayList;

public class Cardapio {
    //ItemCardapio[] itens = new ItemCardapio[0];
    ArrayList<ItemCardapio> itens = new ArrayList<>();

    void adicionarItem(ItemCardapio item) {
        itens.add(item);
    }

    void removerItem(int indice) {
        itens.remove(indice);
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                item.imprimir();
            }
        }
    }

    ArrayList<ItemCardapio> consultarItensPorPreco(double precoMinimo, double precoMaximo) {

        ArrayList<ItemCardapio> itensSelecionados = new ArrayList<>();

        for (ItemCardapio item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                itensSelecionados.add(item);
            }
        }

        return itensSelecionados;

    }

}
