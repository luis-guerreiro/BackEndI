package Aula6_IntegradoraII;

public interface IGradeDeFilmes {

    public Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException;
}
