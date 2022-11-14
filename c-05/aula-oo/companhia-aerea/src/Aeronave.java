public class Aeronave {

    public boolean ativo = true;
    int totalAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis() {
        return totalAssentos - assentosReservados;
    }

    void desativar() {
        ativo = false;
    }

    void ativar() {
        ativo = true;
    }

    void reservarAssentos(int numeroAssentos) {
        if (ativo) {
            assentosReservados += numeroAssentos;
        } else {
            System.out.println("Aeronave está desativada. Assentos não reservados");
        }
    }
}
