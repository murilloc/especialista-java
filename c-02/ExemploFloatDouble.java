public class ExemploFloatDouble{
	public static void main(String[] args){
		double peso = 94.9D; // opcionalmente pode-se colocar um "d" no final do número para indicar que é um double
		
		System.out.println("Peso :" + peso);
		
		// float taxa = 1_554.94; não compila
		float taxa = 1_554.94F;
		
		System.out.println("Taxa: " + taxa);
						
	}
}
