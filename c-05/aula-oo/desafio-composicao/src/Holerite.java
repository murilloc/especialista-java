public class Holerite {
    Funcionario funcionario;
    double valorHorasNormais;
    double valorHorasExtras;
    double valorAdicionalFilhos;
    int totalHorasNormais;
    int totalHorasExtras;

    double calcularValorTotal() {
        return valorHorasExtras + valorHorasNormais + valorAdicionalFilhos;
    }





    void imprimirHolerite() {
        System.out.println("----------CONTRACHEQUE-------------");
        System.out.printf("Nome funcionário: %s%n",funcionario.nome);
        System.out.printf("Total de Dependentes: %d%n", funcionario.quantidadeFilhos);
        System.out.printf("Total horas extras: %d%n", totalHorasNormais);
        System.out.printf("Total horas extras: %d%n", totalHorasExtras);
        System.out.printf("Salário horas extras: %.2f%n", valorHorasExtras);
        System.out.printf("Salario horas normais: %.2f%n", valorHorasNormais);
        System.out.printf("Salário total à receber: %.2f%n", calcularValorTotal());

    }

}
