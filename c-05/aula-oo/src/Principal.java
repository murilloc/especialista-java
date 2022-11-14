public class Principal {

    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        Carro seuCarro = new Carro();

        Pessoa eu = new Pessoa();
        eu.nome = "Murillo Cesar";
        eu.cpf = "999.999.999-99";
        eu.anoNascimento = 1966;


        Pessoa voce = new Pessoa();
        voce.nome = "Veronica Nogueira";
        voce.cpf = "222.222.222.22";
        voce.anoNascimento = 2000;


        meuCarro.anoFabricacao = 2022;
        meuCarro.cor = "preto";
        meuCarro.modelo = "HRV";
        meuCarro.fabricante = "Honda";
        meuCarro.precoCompra = 120_000;
        meuCarro.proprietario = eu;

        seuCarro.anoFabricacao = 2015;
        seuCarro.cor = "branco";
        seuCarro.modelo = "Corolla";
        seuCarro.fabricante = "Toyota";
        seuCarro.precoCompra = 110_000;
        seuCarro.proprietario = voce;

        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Fabricante: %s%n", meuCarro.fabricante);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);
        System.out.printf("Valor IPVA: %6.2f%n", meuCarro.calcularIpva());
        meuCarro.imprimirResumoDepreciacao();

        System.out.println("------------------------------------------------");

        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Fabricante: %s%n", seuCarro.fabricante);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", seuCarro.proprietario.nome);
        System.out.printf("Valor IPVA: %6.2f%n", seuCarro.calcularIpva());
        seuCarro.imprimirResumoDepreciacao();


    }
}


