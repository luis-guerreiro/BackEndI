package Aula4_ChainOfResponsabilityPattern;

public class GerenciadorTecnico extends Gerenciador{

    @Override
    public void verificar(Mail email){
        if((email.getDestino().equalsIgnoreCase("tecnica@colmeia.com")) ||
                (email.getAssunto().equalsIgnoreCase("Técnico")))
        {
            System.out.println("Enviando ao departamento Técnico");
        }
        else {
            if(this.getSeguinte()!=null)
            { // chamamos ao método o seguinte objeto
                this.getSeguinte().verificar(email);
            }
        }
    }
}
