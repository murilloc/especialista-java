public class ConversaoLongToInt {
	public static void main(String[] args){
		long x = 10;
		// int y = x;  error incompatible types: possible lossy conversion from long to int
		
		// forçando o casting
		int y = (int) x; 		
		System.out.println(x);
		System.out.println(y);
		
		// perda de informação		
		long a = 9300000035L;
		int b = (int) a; 		
		System.out.println(a);
		System.out.println(b);
		
	}
}
