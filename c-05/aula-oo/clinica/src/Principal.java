public class Principal {

    public static void main(String[] args) {
        Cachorro kika = new Cachorro();
        Cachorro dana = new Cachorro();

        kika.idade = 17;
        kika.sexo = 'F';
        kika.nome = "Kika";
        kika.raca = "SRD";

        dana.idade = 13;
        dana.sexo = 'F';
        dana.nome = "Dana";
        dana.raca = "Rottweiller";

        System.out.printf("Dados do animal 1: Nome: %s , Sexo: %s , Idade: %d , Raça: %s%n", kika.nome, kika.sexo, kika.idade, kika.raca);
        System.out.printf("Dados do animal 2: Nome: %s , Sexo: %s , Idade: %d , Raça: %s%n", dana.nome, dana.sexo, dana.idade, dana.raca);

    }
}
