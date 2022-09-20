import java.util.Scanner;

public class PagamentoPrestadores{
	
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Pagamento de Prestadores de Serviço");
		System.out.println("-----------------------------------");
		
		System.out.print("Nome:");
		String nome = entrada.nextLine();
		
		System.out.print("Valor por hora:");
		double valorHora = entrada.nextDouble();
		
		System.out.print("Horas trabalhadas:");
		int horasTrabalhadas = entrada.nextInt();
		
		System.out.print("Desconto:");
		double desconto = entrada.nextDouble();
		
		double pagamentoTotal = horasTrabalhadas * valorHora;
		double totalDevido = pagamentoTotal - desconto;
				
		System.out.printf("%nFolha de pagamento: %s%n",nome);
		System.out.printf("%d horas x %.2f = %.2f%n",horasTrabalhadas, valorHora, pagamentoTotal);
		System.out.printf("Descontos: : %.2f%n",desconto);
		System.out.printf("Total devido: %.2f%n",totalDevido);

	}
}