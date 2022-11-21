public class TesteVazamentoMemoria2 {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();
        pilha.imprimirEstatistica();

        for (int i = 0; i < 6; i++) {
            Cliente cliente = new Cliente();
            cliente.nome = "cliente " + i;
            pilha.adicionar(cliente);
        }

        Cliente clienteRetirado = null;

        do {
            clienteRetirado = pilha.retirar();
            pilha.imprimirEstatistica();
        } while (clienteRetirado != null);

        System.out.println("Pilha está vazia. Até aqui, ok!");

        // BOOOOM!!! OutOfMemory
        for (int i = 0; i < 3; i++) {
            Cliente cliente = new Cliente();
            cliente.nome = "cliente adicional " + i;
            pilha.adicionar(cliente);
        }


    }
}
