import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        int[] numerosJogo1 = {25, 11, 8, 46, 37, 14};
        int[] numerosJogo2 = Arrays.copyOf(numerosJogo1, numerosJogo1.length);
        int[] numerosJogo3 = Arrays.copyOf(numerosJogo1, numerosJogo1.length + 1);

        numerosJogo3[numerosJogo3.length - 1] = 44;

        System.out.printf("Original: %s%n", Arrays.toString(numerosJogo1));
        System.out.printf("Cópia: %s %n", Arrays.toString(numerosJogo2));
        System.out.printf("Cópia expandida %s %n", Arrays.toString(numerosJogo3));

        Turma turmaB = new Turma();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "Tia Maria";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Joãozino";
        aluno1.idade = 7;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Laura";
        aluno2.idade = 4;

        turmaB.adicionarAluno(aluno1);
        turmaB.adicionarAluno(aluno2);

        turmaB.imprimirListaAlunos();

    }


}
