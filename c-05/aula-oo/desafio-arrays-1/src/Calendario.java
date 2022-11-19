public class Calendario {

    static String obterNomeMes(int numeroMes) {
        return switch (numeroMes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> null;
        };
    }

    static String obterNomeMesRefatorado(int numeroMes) {

        String mesSelecionado;
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
            "Setembro", "Outubro", "Novembro", "Dezembro",};

        if (numeroMes >= 1 && numeroMes <= 12) {
            mesSelecionado = meses[numeroMes - 1];
        } else {
            mesSelecionado = "Numero do mês inválido";
        }

        return mesSelecionado;
    }

    public static void main(String[] args) {
        String mes = Calendario.obterNomeMes(9);
        System.out.println(mes);

        mes = Calendario.obterNomeMesRefatorado(5);
        System.out.println(mes);
    }

}
