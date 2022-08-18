package Aula6_IntegradoraII;

public class Main {
    public static void main(String args[]){

        GradeDeFilmesProxy proxy = new GradeDeFilmesProxy(new GradeDeFilmes());

        proxy.setIp(new Ip(245,23,23,25));

        try {
            System.out.println(proxy.getFilme("The White Tiger").getLink());
            System.out.println("Acesso do filme liberado!!!");
        }
        catch(FilmeNaoHabilitadoException e){
            System.out.println(e);
        }
    }
}
