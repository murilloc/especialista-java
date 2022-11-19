import java.util.ArrayList;

public class Turma {

    String identificacao;
    String nomeProfessora;
    ArrayList<Aluno> alunos = new ArrayList<>();

    void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    void removerAluno(int indice) {
        alunos.remove(indice);
    }

    void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    void imprimirListaAlunos() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.printf("%s (%d anos) %n", aluno.nome, aluno.idade);
            } else {
                System.out.println("Vago");
            }
        }
    }
}
