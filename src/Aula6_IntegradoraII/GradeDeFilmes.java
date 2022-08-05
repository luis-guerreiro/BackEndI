package Aula6_IntegradoraII;

public class GradeDeFilmes {


    public Filme getFilme(String nomeDoFilme){
        Filme f = null;

        switch (nomeDoFilme)
        {
            case "The White Tiger":
                f = new Filme("The White Tiger","ARG","www.wtiger.com");
                break;
            case "His Houser":
                f = new Filme("His Houser","BRA","www.hhouser.com");
                break;
            case "Over The Moon":
                f = new Filme("Over the Moon","COL","www.omoon.com");
                break;
            case "Superbad":
                f = new Filme("Superbad","ARG","www.sbad.com");
                break;
            case "The Babysitter":
                f = new Filme("The Babysitter","COL","www.babys.com");
                break;
        }
        return f;
    }
}
