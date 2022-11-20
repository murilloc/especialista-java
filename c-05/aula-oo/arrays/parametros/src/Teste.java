import java.util.Arrays;

public class Teste {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));

        if (args.length <= 1) {
            System.out.printf("Use java %s [pt|en] [seu nome]%n",Thread.currentThread().getStackTrace()[1].getClassName());
        } else if (args[0].equals("en")) {
            System.out.printf("Hello, %s%n", args[1]);
        } else if (args[0].equals("pt")) {
            System.out.printf("Olá, %s%n", args[1]);
        } else {
            System.out.println("Idioma não suportado");
        }
    }


    String gatClassName(){
        Class<?> enclosingClass = getClass().getEnclosingClass();
        if (enclosingClass != null) {
            return enclosingClass.getName();
        } else {
            return getClass().getName();
        }
    }
}