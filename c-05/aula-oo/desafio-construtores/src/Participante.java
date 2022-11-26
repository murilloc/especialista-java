import java.util.Objects;

public class Participante {

    static final int SALDO_PONTOS_INICIAL = 0;

    String nome;
    int saldoDePontos;

    Participante(String nome) {
        this(nome, SALDO_PONTOS_INICIAL);
    }

    Participante(String nome, int saldoDePontos) {
        Objects.requireNonNull(nome, "O nome do participante é obrigatório");

        if (saldoDePontos < 0) {
            throw new IllegalArgumentException("O saldo de pontos deve ser positivo");
        }
        this.nome = nome;
        this.saldoDePontos = saldoDePontos;
    }

}
