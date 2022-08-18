package Teste;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main2 {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {

        // Alternativa para configurar o log4j.properties
        BasicConfigurator.configure();

        Leao leao = new Leao("Simba", 8, true);
        leao.correr();
        leao.eMaiorQue10();

        try {
            leao.eMaiorQue10();
        } catch (Exception e) {
            logger.error("A idade do leão " +
                    leao.getNome() +
                    " está incorreta", e);
        }

        Leao leao1 = new Leao();
        leao1.setNome("Simba");
        leao1.setIdade(4);
        leao1.seteAlfa(true);
    }

}
