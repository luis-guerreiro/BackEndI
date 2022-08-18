package Aula4_ChainOfResponsabilityPattern;

public class ProcessaMail {

    public static void main(String args[]){
        CheckMail processo = new CheckMail();

        processo.verificar(new Mail("email@email.com","tecnica@digitalhouse.com","Reclamação"));
        processo.verificar(new Mail("email@email.com","sds@digitalhouse.com","Gerência"));
        processo.verificar(new Mail("email@email.com","juan@pepelegal.com","Comercial"));
        processo.verificar(new Mail("email@email.com","tecnica@colmeia.com","Reclamação"));
    }
}
