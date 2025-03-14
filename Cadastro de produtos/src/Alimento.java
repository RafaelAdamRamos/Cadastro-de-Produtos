public class Alimento extends Produto {
    String categoriaAli, dataValidade;

    public Alimento(String codProduto, String nomeProduto, double precoProduto, String dataValidade, String categoriaAli) {
        super(nomeProduto, codProduto, precoProduto);
        this.dataValidade = dataValidade;
        this.categoriaAli = categoriaAli;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Data de Validade: "  + dataValidade + "\nCategoria: " + categoriaAli);
    }
}
