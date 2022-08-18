package Aula6_IntegradoraII;

public class GradeDeFilmesProxy implements IGradeDeFilmes{

    private GradeDeFilmes gradeDeFilmes;
    private Ip ipRec;

    public GradeDeFilmesProxy(GradeDeFilmes gradeDeFilmes){
        this.setFilme(gradeDeFilmes);
    }

    public void setIp(Ip ip){
        this.ipRec = ip;
    }

    @Override
    public Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException{
        Filme f = gradeDeFilmes.getFilme(nomeDoFilme);

        if(!(getIp().getPais()).equalsIgnoreCase(f.getPais())){
            throw new FilmeNaoHabilitadoException(nomeDoFilme+" não disponível no(a) "+getIp().getPais());
        }
        return f;
    }

    public void setFilme(GradeDeFilmes filme){
        this.gradeDeFilmes = filme;
    }

    public Ip getIp(){
        return ipRec;
    }
}
