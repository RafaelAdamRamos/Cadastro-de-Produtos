public class Eletronico extends Produto {
    //Declarando variáveis da classe filho Eletronico
    String marcaEletronico = " ";
    int garantiaEletronico = 0;

    //Construtor da classe filho Eletronico
    public Eletronico(String codProduto, String nomeProduto, double precoProduto, String marcaEletronico, int garantiaEletronico) {
        //Import das variáveis da classe Pai
        super(nomeProduto, codProduto, precoProduto);
        this.marcaEletronico = marcaEletronico;
        this.garantiaEletronico = garantiaEletronico;
    }

    //Sobrescreve Função da classe Pai
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        //Adiciona váriaveis da classe Eletronico a função
        System.out.println("Marca: " + marcaEletronico + "\nAno garantia: " + garantiaEletronico);
    }
}
