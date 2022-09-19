public class PromocaoAritmetica3 {
	public static void main(String[] args){
		
		int x = 3;
		int y = 2; 
		float z = (float) x / y; // converte um dos operadores para float, nesse caso o x
		System.out.println(z);
		
		// operação entre inteiros gera um inteiro que posteriormente será convertido para float
		z =  x / y;
		System.out.println(z);
		
	}
}