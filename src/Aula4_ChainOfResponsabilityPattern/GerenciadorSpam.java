package Aula4_ChainOfResponsabilityPattern;

public class GerenciadorSpam extends Gerenciador{

    @Override
    public void verificar(Mail email){
        System.out.println("Marcado como spam");
    }
}
