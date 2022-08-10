package Teste;

public class Main1 {
    public static void main (String args[]){
        Calculadora calculadora = new Calculadora(1,3);
        int soma = calculadora.somar();
        System.out.println(soma);

        Calculadora calculadora1 = new Calculadora(1,0);
        double divisao = calculadora.dividir();
        System.out.println(divisao);
    }
}
