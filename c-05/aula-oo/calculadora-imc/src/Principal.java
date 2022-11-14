public class Principal {

    public static void main(String[] args) {
        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();

        Paciente eu = new Paciente();

        eu.peso = 105;
        eu.altura = 1.83;

        IndiceMassaCorporal imc = calculadoraIMC.calcular(eu);

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f esta com obesidade.%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f5%n", imc.resultado);

    }
}
