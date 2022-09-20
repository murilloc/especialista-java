import java.util.Scanner;

public class IndiceMassaCorporal{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = entrada.nextLine(); // lê a quebra de linha
		
		System.out.print("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		
		entrada.nextLine(); // Necessário por causa do nextLine a seguir
		
		System.out.print("Academia: ");
		String academia = entrada.nextLine();
		
		double imc = peso / (altura * altura);
				
		
		System.out.printf("%s%n O IMC de %s: %.2f%n",academia, nome, imc);
										
	}
}