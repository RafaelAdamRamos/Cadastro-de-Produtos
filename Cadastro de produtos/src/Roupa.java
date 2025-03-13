public class Roupa extends Produto {
    String tamanhoRoupa = "", materialRoupa = "";

    public Roupa(String nomeProduto, String codProduto, double precoProduto, String tamanhoRoupa, String materialRoupa) {
        super(nomeProduto, codProduto, precoProduto);
        this.tamanhoRoupa = tamanhoRoupa;
        this.materialRoupa = materialRoupa;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tamanho: " + tamanhoRoupa + "\nMaterial: " + materialRoupa);
    }
}
