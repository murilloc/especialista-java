import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        String[][] cidades = new String[3][3];

        cidades[0][0] = "Uberlândia";
        cidades[0][1] = "Rio de Janeiro";
        cidades[0][2] = "São Paulo";

        cidades[1][0] = "Campinas";
        cidades[1][1] = "Macaé";
        cidades[1][2] = "Maricá";

        cidades[2][0] = "Taubaté";
        cidades[2][1] = "Búzios";
        cidades[2][2] = "Niterói";


        //String[][][][] arrayTriDimensional = new String[2][3][2][6];

        String[][] arrayIrregular = new String[3][];

        arrayIrregular[0] = new String[3];
        arrayIrregular[0][0] = "Uberlândia";
        arrayIrregular[0][1] = "Rio de Janeiro";
        arrayIrregular[0][2] = "São Paulo";

        arrayIrregular[1] = new String[2];
        arrayIrregular[1][0] = "Campinas";
        arrayIrregular[1][1] = "Macaé";

        arrayIrregular[2] = new String[1];
        arrayIrregular[2][0] = "Niterói";

        for (int i = 0; i < arrayIrregular.length; i++) {
            for (int j = 0; j < arrayIrregular[i].length; j++) {
                System.out.printf("[%d][%d] = %s%n", i, j, arrayIrregular[i][j]);
            }
        }

        for (String[] cidadesSelecionadas : arrayIrregular) {
            for (String nomeCidade : cidadesSelecionadas) {
                System.out.println(nomeCidade);
            }
        }

    }
}
