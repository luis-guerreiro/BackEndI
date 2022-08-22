package Aula19_SerializacaoDeObjetos;

import java.io.Serializable;

public class Cachorro implements Serializable {

    private int idade;
    private String nome;

    public Cachorro(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
