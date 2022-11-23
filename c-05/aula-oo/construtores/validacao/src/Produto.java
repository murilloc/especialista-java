import java.util.Objects;

public class Produto {

    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    int quantidadeEstoque;
    String nome;

    public Produto() {
        this.nome = "Sem nome";
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;
    }

    Produto(String nome) {

        Objects.requireNonNull(nome, "Nome do produto deve ser informado");
        this.nome = nome;
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;

    }

    public Produto(String nome, int quantidadeEstoque) {
        Objects.requireNonNull(nome, "Nome do produto deve ser informado");
        if (quantidadeEstoque < 0) {
            throw new IllegalArgumentException("Quantidade inicial do produto deve ser informada");
        }
        this.quantidadeEstoque = quantidadeEstoque;
        this.nome = nome;

    }
}
