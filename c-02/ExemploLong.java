public class ExemploLong{
	public static void main(String[] args){
		long populacoaUberlandia = 699_097; //  a partir do Java 7 aceita "_" para melhorar a legibilidade		
		// long populacoaMarte = 2_147_483_648; // n�o funciuona porque o valor literal � um inteiro
		long populacoaMarte = 2_147_483_648L;  // "L" informa ao compilador que o valor deve ser interpretado como um valor long
		
		//System.out.println(2_147_483_648); // n�o compila
		System.out.println(2_147_483_64L); // compila

		System.out.println("Popula��o Uberl�ndia: " + populacoaUberlandia);
		System.out.println("Popula��o de Marte: " + populacoaMarte);
		
		
		
	}
}