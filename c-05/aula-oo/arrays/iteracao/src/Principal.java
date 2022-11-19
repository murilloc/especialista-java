public class Principal {
    public static void main(String[] args) {
        int[] notas = {8, 5, 4, 9, 10, 8};

        double media = Calculadora.calcularMedia(notas);

        System.out.printf("Media: %.2f%n", media);
    }
}
