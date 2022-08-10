package Aula10_Logger;


import org.apache.log4j.Logger;

public class Leao {

    private static final Logger logger = Logger.getLogger(Leao.class);

    private String nome;
    private int idade;
    private boolean eAlfa;

    public Leao(String nome, int idade, boolean eAlfa) {
        this.nome = nome;
        this.idade = idade;
        this.eAlfa = eAlfa;
    }

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

    public boolean iseAlfa() {
        return eAlfa;
    }

    public void seteAlfa(boolean eAlfa) {
        this.eAlfa = eAlfa;
    }

    public void correr(){
        logger.info("O leão "+nome+"está correndo!!!");
    }

    public void eMaiorQue10() throws Exception {
        if(idade>10 && iseAlfa()){
            logger.info("O leão "+nome+" tem mais de 10 anos");

        }else{
            logger.info("A idade ou o boolean, ou ambos, do "+nome+" é falso");
        }

        if(idade<0){
            logger.error("A idade não pode ser negativa");
            throw new Exception();
        }
    }
}
