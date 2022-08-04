package Aula5_ProxyPattern;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class PessoaTest {

    Date data = new Date();

    @Test
    public void vacinar1(){
        Pessoa p1 = new Pessoa("Juca","Silva","5544235644",data,"Pfizer");
        Vacinar vacinar = new ServicoVacinarProxy();

        vacinar.vacinarPessoa(p1.getRg(), p1.getDataVacina(), p1.getNomeVacina());
        System.out.println(p1.toString());
    }
}
