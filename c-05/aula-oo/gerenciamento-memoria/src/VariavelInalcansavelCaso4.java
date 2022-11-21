public class VariavelInalcansavelCaso4 {
    public static void main(String[] args) {

        imprimirUsoDeMemoria();

        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        cliente.endereco = endereco;
        endereco.cliente = cliente;

        cliente = null;
        imprimirUsoDeMemoria();
        System.gc();
        imprimirUsoDeMemoria();
        endereco.cliente = null;
        System.gc();
        imprimirUsoDeMemoria();

        endereco = null;
        System.gc();
        imprimirUsoDeMemoria();


    }


    static void imprimirUsoDeMemoria() {

        System.out.printf("Máxima disponível para a JVM: %s%n", emMegabytes(Runtime.getRuntime().maxMemory()));
        System.out.printf("Total de memória reservada para a JVM: %s%n", emMegabytes(Runtime.getRuntime().totalMemory()));
        System.out.printf("Total de memória ainda disponível para a JVM: %s%n", emMegabytes(Runtime.getRuntime().freeMemory()));

        long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.printf("Total de memória utilizada : %s%n", emMegabytes(memoriaUsada));

        System.out.println("------------------------------------------------------------");

    }

    static String emMegabytes(long bytes) {

        return String.format("%.2f MB", bytes / 1024d / 1024d);
    }

    static class Cliente {

        byte[] x = new byte[500 * 1024 * 1024];
        Endereco endereco;

    }

    static class Endereco {
        byte[] x = new byte[500 * 1024 * 1024];
        Cliente cliente;
    }
}

