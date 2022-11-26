package erp.estoque;

// boa prática importar classes específicas

import java.util.Objects;
import java.util.UUID;

public class Produto {

    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    private final String codigo;
    private String nome;
    private int quantidadeEstoque;

    public Produto() {
        this("sem nome"); // a chamada de outro construtor deve sempre ser a primeira instrução
    }

    public Produto(String nome) {
        this(nome, QUANTIDADE_ESTOQUE_INICIAL);
    }

    // construtor com acesso private
    private Produto(String nome, int quantidadeEstoque) {
        this.codigo = gerarCodigo();
        Objects.requireNonNull(nome, "Nome do produto deve ser informado");

        if (quantidadeEstoque < 0) {
            throw new IllegalArgumentException("Quantidade inicial do produto deve ser informada");
        }
        this.quantidadeEstoque = quantidadeEstoque;
        this.nome = nome;
    }

    private static String gerarCodigo() {
        return UUID.randomUUID().toString();
    }


}
