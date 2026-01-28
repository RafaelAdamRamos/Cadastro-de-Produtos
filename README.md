# Cadastro de Produtos (Java)

> 🔧 **Projeto aprimorável**  
> Este projeto é uma base de estudo em Java para cadastro e manipulação de produtos, com foco em lógica de classes, herança e estrutura de projeto. Pode ser expandido com persistência, interface gráfica ou conexão com banco de dados futuramente.

## Descrição

Este repositório contém um sistema simples em **Java** que representa um cadastro de produtos com diferentes categorias (como alimentos, eletrônicos, roupas etc.). O projeto explora os conceitos de **classes, herança, encapsulamento e lógica de execução**, servindo como base para estudos ou aprimoramento em orientação a objetos.

## Funcionalidade principal

- Representação de produtos por meio de classes Java
- Tipos de produtos diferentes organizados por herança (`Alimento`, `Eletronico`, `Roupa`)
- Classe principal (`Main.java`) que ilustra execução básica do sistema (entrada, processamento e saída)

## Estrutura do Projeto

No projeto você encontrará os seguintes arquivos principais:

| Arquivo | Descrição |
|---------|-----------|
| `Produto.java` | Classe base que representa um produto genérico |
| `Alimento.java` | Subclasse representando alimentos |
| `Eletronico.java` | Subclasse representando eletrônicos |
| `Roupa.java` | Subclasse representando roupas |
| `Main.java` | Classe principal para execução e testes simples |

## Tecnologias Utilizadas

- Linguagem de programação Java

## Como executar o projeto

Siga os passos abaixo para compilar e rodar o projeto localmente:

1. Clone o repositório:
   ```bash
   git clone https://github.com/RafaelAdamRamos/Cadastro-de-Produtos.git

2. Acesse a pasta do projeto:

   ```bash
   cd Cadastro-de-Produtos
   ```
3. Compile os arquivos Java:

   ```bash
   javac *.java
   ```
4. Execute a aplicação:

   ```bash
   java Main
   ```

> 💡 Certifique-se de ter o JDK instalado e configurado no seu sistema antes de compilar.

## Possíveis melhorias

Este projeto pode ser expandido com funcionalidades como:

* **Persistência de dados** (arquivo ou banco de dados)
* **Menu interativo no terminal**
* **Validações de entrada e regras de negócio**
* **Interface gráfica (GUI)**

## Observações

* Projeto voltado a fins de estudo de lógica e estrutura de código em Java
* Pode ser aprimorado conforme novos requisitos ou aprendizado de novas tecnologias
