public class FolhaPagamento {


    Holerite calcularSalario(ContratoTrabalho contrato, int totalHorasNormais, int totalHorasExtras) {

        double valoSalario = (contrato.valorHoraNormal * totalHorasNormais) + (contrato.valorHOraExtra * totalHorasExtras);

        Holerite holerite = new Holerite();
        holerite.funcionario = contrato.funcionario;
        holerite.valorHorasNormais = contrato.valorHoraNormal * totalHorasNormais;
        holerite.valorHorasExtras = contrato.valorHOraExtra * totalHorasExtras;
        holerite.totalHorasNormais = totalHorasNormais;
        holerite.totalHorasExtras = totalHorasExtras;

        holerite.valorAdicionalFilhos = calcularAdicionalFilhos(contrato, valoSalario);

        return holerite;
    }


    double calcularAdicionalFilhos(ContratoTrabalho contrato, double valorSalario) {
        if (contrato.funcionario.temFilhos()) {
            valorSalario *= 0.1;
        }
        return valorSalario;
    }


}
