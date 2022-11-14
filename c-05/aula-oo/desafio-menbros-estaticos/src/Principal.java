public class Principal {

    public static void main(String[] args) {


        double lado = 13.5;
        System.out.printf("Area de um quadrado com lado de %.2f cm: %.2f cm2%n", lado, CalculadoraGeometrica.calcularAreaQuadrado(lado) );

        double raio = 23.6;
        System.out.printf("Area de um círculo com raio de %.2f cm: %.2f cm2%n", raio, CalculadoraGeometrica.calcularAreaCirculo(raio) );

    }
}
