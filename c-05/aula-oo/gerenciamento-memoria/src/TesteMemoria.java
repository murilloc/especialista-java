import java.util.Scanner;

public class TesteMemoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome);
    }
}
