public class Principal3 {

    public static void main(String[] args) {
        Integer numero1 = Integer.valueOf(128);
        Integer numero2 = 128;
        Short numero3 = 128;

        System.out.println(numero1 == numero2);  // compara endereço cache de -127 ate 128
        System.out.println(numero1.equals(numero2)); //compara o conteúdo

        System.out.println(numero1.equals(numero3)); //compara o conteúdo e o tipo de objeto

        // Compare sempre com o tipo primitivo
        System.out.println(numero1.intValue() == numero3.intValue());



    }
}
