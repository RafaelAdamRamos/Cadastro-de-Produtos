import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    // Método para criar um atraso de 3 segundos antes de continuar a execução
    public static void aguarde() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Declaração de variáveis para armazenar informações do produto
        String nomeProduto = "", codProduto = "", marcaEletronico = "", tamanhoRoupa = "", materialRoupa = "", categoriaAli = "", dataValidade = "", pressioneParaCont = "";
        double precoProduto;
        int escolhaInicial = 0, garantiaEletronico = 0;

        // Criação do scanner para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Listas para armazenar os produtos cadastrados
        ArrayList<Eletronico> eletronicos = new ArrayList<>();
        ArrayList<Roupa> roupas = new ArrayList<>();
        ArrayList<Alimento> alimentos = new ArrayList<>();

        // Loop principal do programa para interagir com o usuário até que ele decida sair (-1)
        while (escolhaInicial != -1) {
            // Menu de opções para o usuário
            System.out.println("Bem vindo ao sistema de cadastro de produto. \n 1 - Registrar Eletrônico \n 2 - Registrar Roupa \n 3 - Registrar Alimento \n 4 - Listar Eletrônicos \n 5 - Listar Roupas \n 6 - Listar Alimentos \n-1 - Finalizar Programa \nO que deseja fazer?");
            escolhaInicial = sc.nextInt(); // Captura a escolha do usuário
            sc.nextLine(); // Consome a quebra de linha

            switch (escolhaInicial) {
                case 1:
                    // Cadastro de eletrônico
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

                    // Criação do objeto e adição à lista
                    Eletronico eletronico = new Eletronico(codProduto, nomeProduto, precoProduto, marcaEletronico, garantiaEletronico);
                    eletronicos.add(eletronico);
                    System.out.println("Produto incluído com sucesso!");
                    aguarde();
                    break;

                case 2:
                    // Cadastro de roupa
                    System.out.println("Informe o código do produto: ");
                    codProduto = sc.nextLine();

                    System.out.println("Informe o nome: ");
                    nomeProduto = sc.nextLine();

                    System.out.println("Informe o preço: ");
                    precoProduto = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Informe o tamanho da roupa (Tamanhos alfabéticos): ");
                    tamanhoRoupa = sc.nextLine();

                    System.out.println("Informe o material: ");
                    materialRoupa = sc.nextLine();

                    // Criação do objeto e adição à lista
                    Roupa roupa = new Roupa(codProduto, nomeProduto, precoProduto, tamanhoRoupa, materialRoupa);
                    roupas.add(roupa);
                    System.out.println("Produto incluído com sucesso!");
                    aguarde();
                    break;

                case 3:
                    // Cadastro de alimento
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

                    // Criação do objeto e adição à lista
                    Alimento alimento = new Alimento(codProduto, nomeProduto, precoProduto, dataValidade, categoriaAli);
                    alimentos.add(alimento);
                    System.out.println("Produto incluído com sucesso!");
                    aguarde();
                    break;

                case 4:
                    // Listagem de eletrônicos
                    if (eletronicos.isEmpty()) {
                        System.out.println("\nNão há eletronicos registrados\n");
                        aguarde();
                        break;
                    }
                    System.out.println("\nEletrônicos registrados:");
                    for (Eletronico e : eletronicos) {
                        e.exibirInformacoes();
                        System.out.println("-----------------");
                    }
                    System.out.println("\nPressione qualquer tecla para continuar.");
                    pressioneParaCont = sc.nextLine();
                    break;

                case 5:
                    // Listagem de roupas
                    if (roupas.isEmpty()) {
                        System.out.println("\nNão há roupas registradas\n");
                        aguarde();
                        break;
                    }
                    System.out.println("\nRoupas registradas:");
                    for (Roupa r : roupas) {
                        r.exibirInformacoes();
                        System.out.println("-----------------");
                    }
                    System.out.println("\nPressione qualquer tecla para continuar.");
                    pressioneParaCont = sc.nextLine();
                    break;

                case 6:
                    // Listagem de alimentos
                    if (alimentos.isEmpty()) {
                        System.out.println("\nNão há alimentos registrados\n");
                        aguarde();
                        break;
                    }
                    System.out.println("\nAlimentos registrados:");
                    for (Alimento a : alimentos) {
                        a.exibirInformacoes();
                        System.out.println("-----------------");
                    }
                    System.out.println("\nPressione qualquer tecla para continuar.");
                    pressioneParaCont = sc.nextLine();
                    break;

                case -1:
                    // Finalização do programa
                    System.out.println("Finalizando sistema...");
                    break;

                default:
                    // Opção inválida
                    System.err.println("\nEscolha inválida\n");
                    aguarde();
                    break;
            }
        }
    }
}
