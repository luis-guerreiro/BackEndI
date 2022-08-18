package Aula5_ProxyPattern;

import java.util.Date;

public class ServicoVacinar implements Vacinar{

    @Override
    public void vacinarPessoa(String rg, Date dataVacina, String tipoVacina){
        System.out.println("Usuário(a) "+rg+" vacinado(a) em "+dataVacina+" com sucesso.");
    }
}
