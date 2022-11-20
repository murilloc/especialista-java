public class Principal {

    public static void main(String[] args) {

        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1_293.55;


        ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();

        // abordagem 1
        //String[] emailsCobranca = {"joao@email.com", "pedro@email.com", "maria@email.com"};
        //servicoDeCobranca.pagar(fatura, emailsCobranca);


        // abordagem 2
        //servicoDeCobranca.pagar(fatura, new String[]{"joao@email.com", "pedro@email.com", "maria@email.com"});

        // abordagem 3 - com array vazio
        //servicoDeCobranca.pagar(fatura, new String[0]); ou
        // servicoDeCobranca.pagar(fatura, new String[]{});

        // usando método com varargs
        // obs: varargs precisar se o últomo parâmetro do métodp
        //servicoDeCobranca.pagar(fatura,"joao@email.com","pedro@email.com");
        servicoDeCobranca.pagar(fatura,"joao@email.com","pedro@email.com");



    }
}
