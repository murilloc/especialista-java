import java.util.Objects;

public class ServicoDeCobranca {

    // obs: varargs precisar se o últomo parâmetro do métodp
    void pagar(Fatura fatura, String emailCobranca, String... emailsAdicionais) {

        Objects.requireNonNull(fatura, "A faturá deve ser informada");
        Objects.requireNonNull(emailCobranca, "Informe o e-mail de cobrança");

//        não é uma boa prática, pois falha somente em tempo de execução
//        if (emailsCobranca.length == 0) {
//            throw new IllegalArgumentException("Informe no mínimo um e-mail de cobrança");
//        }

        System.out.printf("Fatura %d, no valor total de R$%.2f, foi paga!%n", fatura.numero, fatura.valorTotal);

        enviarNotificacao(fatura, emailCobranca);
        for (String email : emailsAdicionais) {
            enviarNotificacao(fatura, email);
        }
    }

    private void enviarNotificacao(Fatura fatura, String email) {

        System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);

    }
}
