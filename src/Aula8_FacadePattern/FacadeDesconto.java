package Aula8_FacadePattern;

public class FacadeDesconto implements IFacadeDesconto{

    //armazenam nas variáveis uma instância de uma
    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    //construtor que cria as instâncias
    public FacadeDesconto(){
        apiCartao = new ApiCartao();
        apiProduto = new ApiProduto();
        apiQuantidade = new ApiQuantidade();
    }

    //simplifica os descontos
    public int desconto(Cartao cartao,Produto prod, int quantidade){
        int desconto = 0;
        desconto = desconto + apiQuantidade.desconto(quantidade);
        desconto = desconto + apiProduto.desconto(prod);
        desconto = desconto + apiCartao.desconto(cartao);

        return desconto;
    }
}
