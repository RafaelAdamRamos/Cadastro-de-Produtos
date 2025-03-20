public class Alimento extends Produto {
    public String getCategoriaAli() {
        return categoriaAli;
    }

    public void setCategoriaAli(String categoriaAli) {
        this.categoriaAli = categoriaAli;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    //Declarando variáveis da classe filho Alimento
    String categoriaAli, dataValidade;

    //Construtor da classe filho Alimento
    public Alimento(String codProduto, String nomeProduto, double precoProduto, String dataValidade, String categoriaAli) {
        //Import das variáveis da classe Pai
        super(nomeProduto, codProduto, precoProduto);
    }

    //Sobrescreve Função da classe Pai
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        //Adiciona váriaveis da classe Alimento a função
        System.out.println("Data de Validade: "  + dataValidade + "\nCategoria: " + categoriaAli);
    }
}
