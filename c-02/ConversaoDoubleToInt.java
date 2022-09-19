public class ConversaoDoubleToInt {
	public static void main(String[] args){
		
		double largura = 100.37; 
		// int tamanho = largura; error: incompatible types: possible lossy conversion from double to int
		
		// forçando o casting
		int tamanho = (int) largura; 
		System.out.println(largura);
		System.out.println(tamanho);
	}
}