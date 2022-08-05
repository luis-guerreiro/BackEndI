package Aula6_IntegradoraII;

public class Filme {

    private String nome;
    private String pais;
    private String link;

    public Filme(String nome, String pais, String link) {
        this.nome = nome;
        this.pais = pais;
        this.link = link;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", pais='" + pais + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
