import java.util.Arrays;

public class Pilha {


    static final int CAPACIDADE_INICIAL_PADRAO = 4;

    Cliente[] elementos = new Cliente[CAPACIDADE_INICIAL_PADRAO];
    int tamanho = 0;

    void adicionar(Cliente elemento) {
        garantirCapacidade();
        elementos[tamanho++] = elemento;
    }

    // vazamento de memória não intencional
    Cliente retirar() {
        if (tamanho == 0) {
            // TODO lançar exceção
            return null;
        }

        //return elementos[--tamanho];

        // Corrigindo o problema de vazamento de memória
        Cliente elenento = elementos[--tamanho];
        elementos[tamanho] = null;

        return elenento;
    }

    void imprimirEstatistica() {
        System.out.printf("Tamanho atual: %d%n", tamanho);
        System.out.printf("Capacidade: %d%n%n", elementos.length);
    }

    private void garantirCapacidade() {
        if (elementos.length == tamanho) {
            elementos = Arrays.copyOf(elementos, tamanho + 10);
        }
    }
}
