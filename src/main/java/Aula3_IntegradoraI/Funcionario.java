package Aula3_IntegradoraI;

import java.util.ArrayList;

public class Funcionario extends Vendedor{

    private int anosAntiguidade;
    private ArrayList<Vendedor> afiliados = new ArrayList<>();

    public Funcionario(String nome, int anosAntiguidade){
        super.nome = nome;
        super.pontos_por_venda = 5;
        this.anosAntiguidade = anosAntiguidade;
    }

    //agregar um afiliado ao funcionario, e por sua vez soma os pontos
    public void addAfiliado(Vendedor afiliado){
        this.afiliados.add(afiliado);
        System.out.println(afiliado.nome+" agora é afiliado de "+super.nome);
    }

    //implementação do método abstrato
    //por ano de antiguidade obtem 5 pontos, por cada afiliado obtem 10 pontos
    @Override
    public int calcularPontos(){
        return (this.afiliados.size()*10)+(this.anosAntiguidade*5);
    }
}
