public class Produto {
    private String nomeProduto, codProduto;
    private double precoProduto = 00.00;

    public Produto(String nomeProduto, String codProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.codProduto = codProduto;
        this.precoProduto = precoProduto;
    }

    public void exibirInformacoes() {
        System.out.println("Cod: " + codProduto + "Nome do Produto: " + nomeProduto + "Preço: " + precoProduto);
    }
}
