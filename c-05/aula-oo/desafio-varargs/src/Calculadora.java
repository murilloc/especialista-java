import java.util.ArrayList;
import java.util.Objects;

public class Calculadora {
    static final int MINIMO_DE_OPERADORES = 2;

    static double calcularMedia(Double numeroA, Double numeroB, double... demaisNumeros) {

        Objects.requireNonNull(numeroA, "Numero 1 deve ser informado");
        Objects.requireNonNull(numeroB, "Numero 2 deve ser informado");

        int totalNumeros = MINIMO_DE_OPERADORES + demaisNumeros.length;
        double somaTotal = numeroA + numeroB;

        for (double numero : demaisNumeros) {
            somaTotal += numero;
        }

        return somaTotal / totalNumeros;

    }
}
