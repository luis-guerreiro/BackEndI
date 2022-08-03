package Aula4_ChainOfResponsabilityPattern;

public class GerenciadorGerencia extends Gerenciador{

    @Override
    public void verificar(Mail email){ // vou fazer a verificação do Destino e do Assunto a partir do meu gerenciador
        if((email.getDestino().equalsIgnoreCase("gerencia@colmeia.com")) ||
                (email.getAssunto().equalsIgnoreCase("Gerência")))
        {
            System.out.println("Enviando ao departamento Gerencial");
        }
        else { // Verifico a próxima entrada e executo novamente o meu método Verificar
            if(this.getSeguinte()!=null)
            {
                this.getSeguinte().verificar(email);
            }
        }
    }


}
