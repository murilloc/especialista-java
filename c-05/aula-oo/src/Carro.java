public class Carro {

    //variáveis de instância
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    Pessoa proprietario;
    double precoCompra;

    double calcularValorRevenda() {

        int vidaUtilEmAnos = 20;
        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - calcularTempoDeUsoEmAnos());

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;

    }

    int calcularTempoDeUsoEmAnos() {
        return 2022 - anoFabricacao;
    }

    void imprimirResumoDepreciacao() {
        System.out.printf("Tempo de uso: %d anos%n", calcularTempoDeUsoEmAnos());
        System.out.printf("Valor de revenda: %6.2f%n", calcularValorRevenda());
    }

    double calcularIpva() {

        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
        if (tempoDeUsoEmAnos >= 10) {
            return 0;
        }
        return calcularValorRevenda() * 0.04;
    }


}
