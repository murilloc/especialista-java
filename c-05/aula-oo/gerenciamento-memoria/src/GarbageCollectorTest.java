public class GarbageCollectorTest {

    public static void main(String[] args) {

        imprimirUsoDeMemoria();

        byte[] x = new byte[500 * 1024 * 1024];
        imprimirUsoDeMemoria();
        x = null;

        // Sugerindo a execução do Garbage Collection
        System.gc();

        //byte[] y = new byte[10 * 1024 * 1024];
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
}
