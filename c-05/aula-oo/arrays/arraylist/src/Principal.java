import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("João");
        alunos.add("Maria");

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
