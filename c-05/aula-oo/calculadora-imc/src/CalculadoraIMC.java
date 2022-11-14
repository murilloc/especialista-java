public class CalculadoraIMC {

    IndiceMassaCorporal calcular(Paciente paciente) {
        double imcCalculado = paciente.peso / (paciente.altura * paciente.altura);

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.altura = paciente.altura;
        imc.peso = paciente.peso;
        imc.resultado = imcCalculado;
        return imc;

    }

}
