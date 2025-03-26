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
        int escolhaInicial = 0, garantiaEletronico = 0, escolhaRegist = 0, escolhaList = 0, escolhaAlt = 0, escolhaExc = 0;
        boolean codEncontrado = false;


        // Criação do scanner para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Listas para armazenar os produtos cadastrados
        ArrayList<Eletronico> eletronicos = new ArrayList<>();
        ArrayList<Roupa> roupas = new ArrayList<>();
        ArrayList<Alimento> alimentos = new ArrayList<>();

        // Loop principal do programa para interagir com o usuário até que ele decida sair (-1)
        while (escolhaInicial != -1) {
            // Menu de opções para o usuário
            System.out.println("Bem vindo ao sistema de cadastro de produto. \n 1 - Registrar  \n 2 - Listar \n 3 - Alterar \n 4 - Excluir \n-1 - Finalizar Programa \nO que deseja fazer?");
            escolhaInicial = sc.nextInt(); // Captura a escolha do usuário
            sc.nextLine(); // Consome a quebra de linha

            switch (escolhaInicial) {
                case 1:
                    System.out.println("Qual tipo de produto deseja registrar? \n1 - Eletrônico \n2 - Roupa \n3 - Alimento");
                    escolhaRegist = sc.nextInt();
                    sc.nextLine();
                    if (escolhaRegist == 1) {
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
                    } else if (escolhaRegist == 2) {
                        //Cadastro de roupa
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
                    } else if (escolhaRegist == 3) {
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
                    } else {
                        System.err.println("Escolha inválida");
                        break;
                    }

                case 2:
                    System.out.println("Qual tipo de produto deseja listar? \n1 - Eletrônico \n2 - Roupa \n3 - Alimento");
                    escolhaList = sc.nextInt();
                    sc.nextLine();
                    if (escolhaList == 1) {
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
                    } else if (escolhaList == 2) {
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
                    } else if (escolhaList == 3) {
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
                    } else {
                        System.err.println("Escolha inválida");
                        break;
                    }

                case 3:
                    System.out.println("Qual tipo de produto deseja alterar? \n1 - Eletrônico \n2 - Roupa \n3 - Alimento");
                    escolhaAlt = sc.nextInt();
                    sc.nextLine(); // Limpa o buffer

                    System.out.println("Informe o código do produto que deseja alterar: ");
                    codProduto = sc.nextLine();

                    codEncontrado = false; // Resetando a variável de controle

                    if (escolhaAlt == 1) {
                        for (Eletronico e : eletronicos) {
                            if (e.getCodProduto().equals(codProduto)) {
                                codEncontrado = true;
                                System.out.println("Produto encontrado! Informe os novos dados:");

                                System.out.println("Novo nome: ");
                                e.setNomeProduto(sc.nextLine());

                                System.out.println("Novo preço: ");
                                e.setPrecoProduto(sc.nextDouble());
                                sc.nextLine();

                                System.out.println("Nova marca: ");
                                e.setMarcaEletronico(sc.nextLine());

                                System.out.println("Nova garantia (meses): ");
                                e.setGarantiaEletronico(sc.nextInt());
                                sc.nextLine();

                                System.out.println("Produto atualizado com sucesso!");
                                break;
                            }
                        }
                    } else if (escolhaAlt == 2) {
                        for (Roupa r : roupas) {
                            if (r.getCodProduto().equals(codProduto)) {
                                codEncontrado = true;
                                System.out.println("Produto encontrado! Informe os novos dados:");

                                System.out.println("Novo nome: ");
                                r.setNomeProduto(sc.nextLine());

                                System.out.println("Novo preço: ");
                                r.setPrecoProduto(sc.nextDouble());
                                sc.nextLine();

                                System.out.println("Novo tamanho: ");
                                r.setTamanhoRoupa(sc.nextLine());

                                System.out.println("Novo material: ");
                                r.setMaterialRoupa(sc.nextLine());

                                System.out.println("Produto atualizado com sucesso!");
                                break;
                            }
                        }
                    } else if (escolhaAlt == 3) {
                        for (Alimento a : alimentos) {
                            if (a.getCodProduto().equals(codProduto)) {
                                codEncontrado = true;
                                System.out.println("Produto encontrado! Informe os novos dados:");

                                System.out.println("Novo nome: ");
                                a.setNomeProduto(sc.nextLine());

                                System.out.println("Novo preço: ");
                                a.setPrecoProduto(sc.nextDouble());
                                sc.nextLine();

                                System.out.println("Nova data de validade: ");
                                a.setDataValidade(sc.nextLine());

                                System.out.println("Nova categoria: ");
                                a.setCategoriaAli(sc.nextLine());

                                System.out.println("Produto atualizado com sucesso!");
                                break;
                            }
                        }
                    } else {
                        System.out.println("Opção inválida.");
                    }

                    if (!codEncontrado) {
                        System.out.println("Código do produto não encontrado.");
                    }

                    aguarde();
                    break;
/* Alterar
                case 4:
                    System.out.println("Qual tipo de produto deseja excluir? \n1 - Eletrônico \n2 - Roupa \n3 - Alimento");
                    escolhaExc = sc.nextInt();
                    sc.nextLine(); // Limpa o buffer

                    System.out.println("Informe o código do produto que deseja alterar: ");
                    codProduto = sc.nextLine();

                    codEncontrado = false; // Resetando a variável de controle

                    if (escolhaAlt == 1) {
                        for (Eletronico e : eletronicos) {
                            if (e.getCodProduto().equals(codProduto)) {
                                codEncontrado = true;
                                System.out.println("Produto encontrado! Informe os novos dados:");

                                System.out.println("Novo nome: ");
                                e.setNomeProduto(sc.nextLine());

                                System.out.println("Novo preço: ");
                                e.setPrecoProduto(sc.nextDouble());
                                sc.nextLine();

                                System.out.println("Nova marca: ");
                                e.setMarcaEletronico(sc.nextLine());

                                System.out.println("Nova garantia (meses): ");
                                e.setGarantiaEletronico(sc.nextInt());
                                sc.nextLine();

                                System.out.println("Produto atualizado com sucesso!");
                                break;
                            }
                        }
                    } else if (escolhaAlt == 2) {
                        for (Roupa r : roupas) {
                            if (r.getCodProduto().equals(codProduto)) {
                                codEncontrado = true;
                                System.out.println("Produto encontrado! Informe os novos dados:");

                                System.out.println("Novo nome: ");
                                r.setNomeProduto(sc.nextLine());

                                System.out.println("Novo preço: ");
                                r.setPrecoProduto(sc.nextDouble());
                                sc.nextLine();

                                System.out.println("Novo tamanho: ");
                                r.setTamanhoRoupa(sc.nextLine());

                                System.out.println("Novo material: ");
                                r.setMaterialRoupa(sc.nextLine());

                                System.out.println("Produto atualizado com sucesso!");
                                break;
                            }
                        }
                    } else if (escolhaAlt == 3) {
                        for (Alimento a : alimentos) {
                            if (a.getCodProduto().equals(codProduto)) {
                                codEncontrado = true;
                                System.out.println("Produto encontrado! Informe os novos dados:");

                                System.out.println("Novo nome: ");
                                a.setNomeProduto(sc.nextLine());

                                System.out.println("Novo preço: ");
                                a.setPrecoProduto(sc.nextDouble());
                                sc.nextLine();

                                System.out.println("Nova data de validade: ");
                                a.setDataValidade(sc.nextLine());

                                System.out.println("Nova categoria: ");
                                a.setCategoriaAli(sc.nextLine());

                                System.out.println("Produto atualizado com sucesso!");
                                break;
                            }
                        }
                    } else {
                        System.out.println("Opção inválida.");
                    }

                    if (!codEncontrado) {
                        System.out.println("Código do produto não encontrado.");
                    }

                    aguarde();
                    break;
               */
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

