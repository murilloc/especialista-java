public class TesteVazamentoMemoria {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();
        pilha.imprimirEstatistica();

        for (int i = 0; i < 10; i++) {
            Cliente cliente = new Cliente();
            cliente.nome = "cliente " + i;
            pilha.adicionar(cliente);
        }

        Cliente clienteRetirado = null;

        do {
            clienteRetirado = pilha.retirar();
            pilha.imprimirEstatistica();
        } while (clienteRetirado != null);


    }
}
