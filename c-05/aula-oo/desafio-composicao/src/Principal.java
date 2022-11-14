public class Principal {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Fulano de Tal";
        funcionario.quantidadeFilhos = 3;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHOraExtra = 90.60;
        contratoTrabalho.valorHoraNormal = 60.30;

        FolhaPagamento folha = new FolhaPagamento();

        Holerite holerite = folha.calcularSalario(contratoTrabalho, 200, 30);

        holerite.imprimirHolerite();

    }
}
