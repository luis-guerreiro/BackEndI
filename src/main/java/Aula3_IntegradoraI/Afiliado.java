package Aula3_IntegradoraI;

public class Afiliado extends Vendedor{

    public Afiliado(String nome){
        super.nome = nome;
        super.pontos_por_venda = 15;
    }

    @Override
    public int calcularPontos(){
        return this.vendas * pontos_por_venda;
    }
}
