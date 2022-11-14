public class Principal {

    public static void main(String[] args) {

        Aeronave aviaoGol = new Aeronave();

        aviaoGol.totalAssentos = 100;
        aviaoGol.ativar();
        aviaoGol.reservarAssentos(10);

        System.out.printf("GOL (%s): %d assentos disponíveis%n",
            aviaoGol.ativo ? "Ativo" : "Inativo",
            aviaoGol.calcularAssentosDisponiveis());


        //-------------------------------------------------------

        Aeronave aviaoLatam = new Aeronave();

        aviaoLatam.totalAssentos = 120;
        aviaoLatam.ativar();
        aviaoLatam.reservarAssentos(5);

        System.out.printf("GOL (%s): %d assentos disponíveis%n",
            aviaoLatam.ativo ? "Ativo" : "Inativo",
            aviaoLatam.calcularAssentosDisponiveis());


    }
}
