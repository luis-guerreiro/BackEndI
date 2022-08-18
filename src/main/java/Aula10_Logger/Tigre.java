package Aula10_Logger;

import org.apache.log4j.Logger;

public class Tigre {

        private static final Logger logger = Logger.getLogger(Leao.class);

        private String nome;
        private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void correr(){
        logger.info("O tigre "+nome+"está correndo!!!");
    }

    public void eMaiorQue10() throws Exception {
        if(idade>10){
            logger.info("O tigre "+nome+" tem mais de 10 anos");

        }else{
            logger.info("A idade ou o boolean, ou ambos, do "+nome+" é falso");
        }

        if(idade<0){
            logger.error("A idade não pode ser negativa");
            throw new Exception();
        }
    }


}
