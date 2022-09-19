public class FormatacaoString {
	public static void main(String[] args){
		
		// Imprimindo o texto:  Olá, Thiago!
		String nome1 = "Thiago";
		System.out.printf("Olá, %s!%n", nome1); // não há quebra de linha
		
		int quantidade = 48; 		
		System.out.printf("Quantidade: %d itens %n", quantidade); // %d formatação para números inteiros
				
		double peso = 94.9;
		
		System.out.printf("Meu peso é %.2fKg %n", peso);
		System.out.printf("Meu peso é %6.3fKg %n", peso);
		
	}
}