public class Principal {

    public static void main(String[] args) {

        var novoVisitante = new Visitante();
        novoVisitante.nome = "João";
        novoVisitante.idade = 12;

        var cadastroPortaria = new CadastroPortaria();
        //cadastroPortaria.cadastrar(novoVisitante, 10);
        cadastroPortaria.cadastrar(novoVisitante);

        if (novoVisitante.possuiAcessoRestritoPorIdade()) {
            System.out.println("Acesso liberado");
        } else {
            System.out.printf("Acesso não permitido para menores de %d anos.",
                Visitante.IDADE_MINIMA_ACESSO_IRRESTRITO);
        }
    }
}
