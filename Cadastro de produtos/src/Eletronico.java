public class Eletronico extends Produto {
    String marcaEletronico = " ";
    int garantiaEletronico = 0;


    public Eletronico(String codProduto, String nomeProduto, double precoProduto, String marcaEletronico, int garantiaEletronico) {
        super(nomeProduto, codProduto, precoProduto);
        this.marcaEletronico = marcaEletronico;
        this.garantiaEletronico = garantiaEletronico;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Marca: " + marcaEletronico + "\nMeses garantia: " + garantiaEletronico);
    }
}
