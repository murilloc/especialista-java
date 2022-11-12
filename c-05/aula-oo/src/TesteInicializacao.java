public class TesteInicializacao {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 1998;
        meuCarro.fabricante = "GM";
        meuCarro.proprietario.nome = "Cesar";

        Pessoa proprietarioAntigo = meuCarro.proprietario;

        meuCarro.proprietario = new Pessoa();
        System.out.println(meuCarro.fabricante);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.anoFabricacao);

        System.out.println(meuCarro.proprietario.nome);
    }
}
