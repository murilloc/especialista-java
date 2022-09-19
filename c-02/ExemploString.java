public class ExemploString{
	public static void main(String[] args){
		System.out.println("Fala, mergulhador!");
		
		int x = 10;
		int y = 5;
		int z = x + y; 
		
		System.out.println("Resultado: " + z); // 15
		System.out.println("Resultado: " + x + y); // 105
		System.out.println("Resultado: " + (x + y));  // () define a precedencia da operação aritmética
		System.out.println(x + y + " foi o resultado: "); // 15
		
		
		// Declaração de variáveis do tipo String
		
		String nome = "Maria"; // String não é um tipo primitvo. é uma classe
		int idade = 63; 
		
		System.out.println(nome + " tem " + idade + " anos");
		
		
	}
}