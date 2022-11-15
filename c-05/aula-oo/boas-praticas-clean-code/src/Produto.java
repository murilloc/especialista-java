import org.w3c.dom.ls.LSOutput;

public class Produto {

    String nome;
    double precoUnitario;
    boolean estaAtivo;

//    void alterarStatus(boolean estaAtivo) {
//        this.estaAtivo = estaAtivo;
//        System.out.printf("%s%n", estaAtivo ? "Ativando" : "Desativando");
//    }

    void ativar(){
        this.estaAtivo = true;
        System.out.println("Ativando produto");
    }

    void inativar(){
        this.estaAtivo = false;
        System.out.println("Inativando produto");
    }


}
