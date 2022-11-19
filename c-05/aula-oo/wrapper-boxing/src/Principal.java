public class Principal {

    public static void main(String[] args) {
        int idade = 20;

        short idadeShort = (short) idade;
        Integer diasEntrega = 30;
        double valorTotal = 1500.35;

        short diasEntregasShort = diasEntrega.shortValue();
        Short diasEntregasShortBoxing = diasEntrega.shortValue();

    }
}
