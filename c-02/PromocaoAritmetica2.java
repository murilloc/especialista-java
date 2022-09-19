public class PromocaoAritmetica2 {
	public static void main(String[] args){
		
		int x = 10;
		float y = 9.34f; 
		// long z = x * y;  error: incompatible types: possible lossy conversion from float to long	

		// perda de dados 
		long z = (long) (x * y);		
		System.out.println(z);
		
		// sem preda de dados 
		float a = (x * y);
		System.out.println(a);
		
	}
}