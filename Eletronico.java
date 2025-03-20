public class Eletronico extends Produto {
    public String getMarcaEletronico() {
        return marcaEletronico;
    }

    public void setMarcaEletronico(String marcaEletronico) {
        this.marcaEletronico = marcaEletronico;
    }

    public int getGarantiaEletronico() {
        return garantiaEletronico;
    }

    public void setGarantiaEletronico(int garantiaEletronico) {
        this.garantiaEletronico = garantiaEletronico;
    }

    //Declarando variáveis da classe filho Eletronico
    String marcaEletronico = " ";
    int garantiaEletronico = 0;

    //Construtor da classe filho Eletronico
    public Eletronico(String codProduto, String nomeProduto, double precoProduto, String marcaEletronico, int garantiaEletronico) {
        //Import das variáveis da classe Pai
        super(nomeProduto, codProduto, precoProduto);
    }

    //Sobrescreve Função da classe Pai
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        //Adiciona váriaveis da classe Eletronico a função
        System.out.println("Marca: " + marcaEletronico + "\nAno garantia: " + garantiaEletronico);
    }
}
