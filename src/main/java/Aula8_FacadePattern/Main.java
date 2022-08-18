package Aula8_FacadePattern;

public class Main {
    public static void main(String args[]){
        FacadeDesconto facadeDesconto = new FacadeDesconto();

        Cartao cartao = new Cartao("33443344223433","Star Bank");
        Produto produto = new Produto("ervilhas","Lata");

        System.out.println("\nDesconto: "+facadeDesconto.desconto(cartao,produto,1));
    }
}
