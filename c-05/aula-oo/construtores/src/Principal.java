public class Principal {

    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    public static void main(String[] args) {
        Produto produto1 = new Produto(null);
        Produto produto2 = new Produto("Pack 12 un Heineken", 10);
        Produto produto3 = new Produto();


        System.out.printf("Produto 1: %s - %d%n", produto1.nome, produto1.quantidadeEstoque);
        System.out.printf("Produto 2: %s - %d%n", produto2.nome, produto2.quantidadeEstoque);
        System.out.printf("Produto 3: %s - %d%n", produto3.nome, produto3.quantidadeEstoque);
    }
}
