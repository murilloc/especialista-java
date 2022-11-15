public class CadastroPortaria {

    static final int TEMPO_EXPIRACAO_EM_MESES_PADRAO = 6;

    void cadastrar(Visitante visitante, final int tempoExpiracaoEmMeses) {

        final var tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastrado para %d dias%n", visitante.nome, tempoExpiracaoEmDias);

    }

    void cadastrar(Visitante visitante) {
        this.cadastrar(visitante, TEMPO_EXPIRACAO_EM_MESES_PADRAO);
    }
}
