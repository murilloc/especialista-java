public class Calculadora {

    static double calcularMedia(int[] notas) {

        int total = 0;

        // Enhanced for
        for (int nota : notas) {
            total += nota;
        }

        // ordinary for
//        for (int i = 0; i < notas.length; i++) {
//            total += notas[i];
//        }

        return (double) total / notas.length;
    }
}
