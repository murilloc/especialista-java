import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        int[] numerosJogo1 = {25, 11, 8, 46, 37, 14, 55};
        int[] numerosNovoJogo = new int[numerosJogo1.length - 1];

        System.out.printf("Jogo original: %s%n", Arrays.toString(numerosJogo1));
        System.out.printf("Novo Jogo: %s%n", Arrays.toString(numerosNovoJogo));

        // Compia com remoção do número 8
        int indiceExclusao = 4;

        System.arraycopy(numerosJogo1, 0, numerosNovoJogo, 0, indiceExclusao);
        System.out.printf("Novo Jogo: %s%n", Arrays.toString(numerosNovoJogo));

        System.arraycopy(numerosJogo1,
            indiceExclusao + 1, numerosNovoJogo, indiceExclusao, numerosNovoJogo.length - indiceExclusao);
        System.out.printf("Novo Jogo: %s%n", Arrays.toString(numerosNovoJogo));

    }
}
