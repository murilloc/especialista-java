public class Principal3 {

    public static void main(String[] args) {
        long tempoInicio = System.currentTimeMillis();

        Long soma = 0L;
        //long soma = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            soma += 1;
        }

        System.out.println(soma);

        double duracao = (System.currentTimeMillis() - tempoInicio) / 1000d;
        System.out.printf("Duração: %.2fs%n", duracao);
    }
}
