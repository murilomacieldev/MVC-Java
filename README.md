# Cadastro de Produtos — MVC em Java Console

Projeto da Aula 07 de Arquitetura de Software. Permite cadastrar e listar produtos usando a arquitetura Model–View–Controller (MVC).

## Requisitos

- JDK instalado (Java 8 ou superior), com `java` e `javac` disponiveis no terminal.
- VS Code e a extensao *Extension Pack for Java* (opcionais).

## Como executar no Windows

1. Extraia o ZIP.
2. Abra a pasta `mvcjava`.
3. Execute `executar.bat` com um duplo clique.
4. Se o Windows nao encontrar o Java, instale/configure o JDK e tente novamente.

## Como executar pelo terminal do VS Code

Abra a pasta `mvcjava` no VS Code e, no terminal dessa pasta, execute:

```bash
javac -encoding UTF-8 -d build Main.java model/Produto.java view/ProdutoView.java controller/ProdutoController.java
java -cp build Main
```

Se a pasta `build` ainda nao existir, o compilador normalmente a cria ao usar `-d build`.

## Opcoes do programa

- `1` — cadastrar produto, informando nome e preco.
- `2` — listar todos os produtos cadastrados.
- `0` — encerrar.

Use `19,90` ou `19.90` para informar um preco com centavos. O sistema nao aceita nome vazio nem preco negativo.

## Arquitetura MVC

- **Model (`model/Produto.java`)**: define os atributos do produto, valida os dados e mantem a lista de produtos em memoria.
- **View (`view/ProdutoView.java`)**: apresenta o menu, le entradas, exibe um produto e exibe a lista completa.
- **Controller (`controller/ProdutoController.java`)**: recebe as entradas da View, cadastra no Model e solicita a exibicao dos produtos.
- **Main (`Main.java`)**: inicializa a View e o Controller.

Os dados permanecem apenas na memoria. Ao encerrar o programa, a lista e apagada.

## Teste sugerido para a entrega

1. Cadastre `Caderno` por `15,90`.
2. Cadastre `Caneta` por `3,50`.
3. Cadastre `Mochila` por `89,90`.
4. Escolha a opcao `2` e confira os tres produtos.
5. Escolha a opcao `0` para encerrar.
