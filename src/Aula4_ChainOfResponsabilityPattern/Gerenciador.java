package Aula4_ChainOfResponsabilityPattern;

public abstract class Gerenciador {

    protected Gerenciador gerenciadorSeguinte;

    public Gerenciador getSeguinte(){
        return this.gerenciadorSeguinte;
    }

    public void setSeguinte(Gerenciador m){
        this.gerenciadorSeguinte = m;
    }

    public abstract void verificar(Mail elMail);
}
