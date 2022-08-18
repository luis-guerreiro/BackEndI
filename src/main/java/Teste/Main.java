package Teste;

public class Main {

    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Triangulo figura = new Triangulo("vermelho");

        System.out.println("\nCriado:"+flyweightFactory.obterTriangulo("vermelho"));

    }
}
