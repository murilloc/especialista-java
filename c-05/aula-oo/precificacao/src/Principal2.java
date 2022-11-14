public class Principal2 {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        /*
         não é uma boa prática acessar uma variável global por uma instância da classe
         produto1.custoEmbalagem = 10;
         produto2.custoEmbalagem = 15; // altera novamente a variável global
        */
        Produto.alterarCustoEmbalagem(12.00);
        //produto2.alterarCustoEmbalagem(20.00);
        Produto.imprimirCustoEmbalagem();
        //produto2.imprimirCustoEmbalagem();
    }
}
