import java.util.ArrayList;

// G1 - garbage first  lança erro antes do estouro total da memória
// -Xms4G -Xms4G  impede esse comportamento

public class OutOfMemoryErrorTest {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        while (true) {
            imprimirUsoDeMemoria();
            clientes.add(new Cliente());
        }
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
        byte[] x = new byte[100 * 1024 * 1024];
    }
}
