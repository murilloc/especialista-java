public class NumeroUtil {

    static int selecionarMaior(int numero1, int numero2) {
        return Math.max(numero1, numero2);
    }

    static int selecionarMaior(int numero1, int numero2, int numero3) {
        return numero1 > numero2 ? numero1 : Math.max(numero2, numero3);
    }


    static double selecionarMaior(double numero1, double numero2) {
        return Math.max(numero1, numero2);
    }

    static double selecionarMaior(double numero1, double numero2, double numero3) {
        return numero1 > numero2 ? numero1 : Math.max(numero2, numero3);
    }


}
