public class FormatacaoString {
	public static void main(String[] args){
		
		// Imprimindo o texto:  Ol�, Thiago!
		String nome1 = "Thiago";
		System.out.printf("Ol�, %s!%n", nome1); // n�o h� quebra de linha
		
		int quantidade = 48; 		
		System.out.printf("Quantidade: %d itens %n", quantidade); // %d formata��o para n�meros inteiros
				
		double peso = 94.9;
		
		System.out.printf("Meu peso � %.2fKg %n", peso);
		System.out.printf("Meu peso � %6.3fKg %n", peso);
		
	}
}