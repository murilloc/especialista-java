import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {
        int[] notas = {8, 5, 4, 9, 10,7};

        Arrays.sort(notas);
        System.out.printf("Notas em string: %s%n",Arrays.toString(notas) );

        Integer[] notas2 = {8, 5, 4, 9, 10,7};
        Arrays.sort(notas2 , Comparator.reverseOrder());
        System.out.printf("Notas em string: %s%n",Arrays.toString(notas2) );

    }
}