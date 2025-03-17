public class Produto {
    //Declarando váriaveis Pai
    String nomeProduto, codProduto;
    double precoProduto = 00.00;

    //Constrtor váriaveis Pai
    public Produto(String nomeProduto, String codProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.codProduto = codProduto;
        this.precoProduto = precoProduto;
    }

    //Função de exibição Pai
    public void exibirInformacoes() {
        System.out.println("Cod: " + codProduto + "\nNome do Produto: " + nomeProduto + "\nPreço: " + precoProduto);
    }
}
