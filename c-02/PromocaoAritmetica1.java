public class PromocaoAritmetica1 {
	public static void main(String[] args){
		
		int x = 10;
		long y = 5; 
		// int z = x * y; não compila error: incompatible types: possible lossy conversion from long to int
		long z = y * x;
		System.out.println(z);
	}
}