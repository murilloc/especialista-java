public class Principal {

    public static void main(String[] args) {
        Participante participante1 = new Participante("Murillo Cesar");
        Participante participante2 = new Participante("Veronica Pereira", 50);

        System.out.printf("Participante 1: %s - %d%n", participante1.nome, participante1.saldoDePontos);
        System.out.printf("Participante 2: %s - %d%n", participante2.nome, participante2.saldoDePontos);


    }


}
