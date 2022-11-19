public class Principal2 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.idade = Integer.valueOf("24");
        cliente.nome = "Murillo Cesar";

        System.out.printf("Idade do Cliente %s: %d", cliente.nome, cliente.idade);
    }
}
