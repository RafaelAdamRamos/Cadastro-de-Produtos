public class Roupa extends Produto {
    public String getTamanhoRoupa() {
        return tamanhoRoupa;
    }

    public void setTamanhoRoupa(String tamanhoRoupa) {
        this.tamanhoRoupa = tamanhoRoupa;
    }

    public String getMaterialRoupa() {
        return materialRoupa;
    }

    public void setMaterialRoupa(String materialRoupa) {
        this.materialRoupa = materialRoupa;
    }

    //Declarando variáveis da classe filho Roupa
    String tamanhoRoupa = "", materialRoupa = "";

    //Construtor da classe filho Roupa
    public Roupa(String codProduto, String nomeProduto, double precoProduto, String tamanhoRoupa, String materialRoupa) {
        //Import das variáveis da classe Pai
        super(nomeProduto, codProduto, precoProduto);
        this.materialRoupa = materialRoupa;
        this.tamanhoRoupa = tamanhoRoupa;
    }

    //Sobrescreve Função da classe Pai
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        //Adiciona váriaveis da classe Roupa a função
        System.out.println("Tamanho: " + tamanhoRoupa + "\nMaterial: " + materialRoupa);
    }
}
