public class Alimento extends Produto {
    //Declarando variáveis da classe filho Alimento
    String categoriaAli, dataValidade;

    //Construtor da classe filho Alimento
    public Alimento(String codProduto, String nomeProduto, double precoProduto, String dataValidade, String categoriaAli) {
        //Import das variáveis da classe Pai
        super(nomeProduto, codProduto, precoProduto);
        this.dataValidade = dataValidade;
        this.categoriaAli = categoriaAli;
    }
    //Sobrescreve Função da classe Pai
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        //Adiciona váriaveis da classe Alimento a função
        System.out.println("Data de Validade: "  + dataValidade + "\nCategoria: " + categoriaAli);
    }
}
