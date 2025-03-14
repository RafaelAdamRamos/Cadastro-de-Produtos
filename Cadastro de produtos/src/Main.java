import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void aguarde() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String nomeProduto = "", codProduto = "", marcaEletronico = "", tamanhoRoupa = "", materialRoupa = "", categoriaAli = "", dataValidade = "";
        double precoProduto;
        int escolhaInicial = 0, garantiaEletronico = 0;


        Scanner sc = new Scanner(System.in);
        ArrayList<Eletronico> eletronicos = new ArrayList<>();
        ArrayList<Roupa> roupas = new ArrayList<>();
        ArrayList<Alimento> alimentos = new ArrayList<>();

        while (escolhaInicial != -1) {
            System.out.println("Bem vindo ao sistema de cadastro de produto. \n 1 - Registrar Eletrônico \n 2 - Registrar Roupa \n 3 - Registrar Alimento \n 4 - Listar Eletrônicos \n 5 - Listar Roupas \n 6 - Listar Alimentos \n-1 - Finalizar Programa \nO que deseja fazer?");
            escolhaInicial = sc.nextInt();
            sc.nextLine();

            switch (escolhaInicial) {
                case 1:
                    System.out.println("Informe o código do produto: ");
                    codProduto = sc.nextLine();

                    System.out.println("Informe o nome: ");
                    nomeProduto = sc.nextLine();

                    System.out.println("Informe o preço: ");
                    precoProduto = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Informe a marca do eletrônico: ");
                    marcaEletronico = sc.nextLine();

                    System.out.println("Informe a garantia em meses: ");
                    garantiaEletronico = sc.nextInt();

                    Eletronico eletronico = new Eletronico(codProduto, nomeProduto, precoProduto, marcaEletronico, garantiaEletronico);
                    eletronicos.add(eletronico);
                    System.out.println("Produto incluído com sucesso!");
                    aguarde();
                    break;

                case 2:
                    System.out.println("Informe o código do produto: ");
                    codProduto = sc.nextLine();

                    System.out.println("Informe o nome: ");
                    nomeProduto = sc.nextLine();

                    System.out.println("Informe o preço: ");
                    precoProduto = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Informe o tamanho da roupa: ");
                    tamanhoRoupa = sc.nextLine();

                    System.out.println("Informe o material: ");
                    materialRoupa = sc.nextLine();

                    Roupa roupa = new Roupa(codProduto, nomeProduto, precoProduto, tamanhoRoupa, materialRoupa);
                    roupas.add(roupa);
                    System.out.println("Produto incluído com sucesso!");
                    aguarde();
                    break;

                case 3:
                    System.out.println("Informe o código do produto: ");
                    codProduto = sc.nextLine();

                    System.out.println("Informe o nome: ");
                    nomeProduto = sc.nextLine();

                    System.out.println("Informe o preço: ");
                    precoProduto = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Informe a data de validade do alimento: ");
                    dataValidade = sc.nextLine();

                    System.out.println("Informe a categoria: ");
                    categoriaAli = sc.nextLine();

                    Alimento alimento = new Alimento(codProduto, nomeProduto, precoProduto, dataValidade, categoriaAli);
                    alimentos.add(alimento);
                    System.out.println("Produto incluído com sucesso!");
                    aguarde();
                    break;

                case 4:
                    System.out.println("\nEletonicos registrados:");
                    for (Eletronico e : eletronicos) {
                        e.exibirInformacoes();
                        System.out.println("-----------------");
                    }
                    aguarde();
                    break;

                case 5:
                    System.out.println("\nRoupas registradas:");
                    for (Roupa r : roupas) {
                        r.exibirInformacoes();
                        System.out.println("-----------------");
                    }
                    aguarde();
                    break;

                case 6:
                    System.out.println("\nAlimentos registradas:");
                    for (Alimento a : alimentos) {
                        a.exibirInformacoes();
                        System.out.println("-----------------");
                    }
                    aguarde();
                    break;

                default:
                    System.out.println("Escolha inválida!");
                    aguarde();
                    break;
            }
        }
    }
}