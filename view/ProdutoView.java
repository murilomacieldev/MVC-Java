package view;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import model.Produto;

public class ProdutoView {
    private final Scanner scanner = new Scanner(System.in);

    public String solicitarOpcao() {
        System.out.println("\n===== CADASTRO DE PRODUTOS =====");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opcao: ");
        return scanner.nextLine().trim();
    }

    public String solicitarNome() {
        System.out.print("Nome do produto: ");
        return scanner.nextLine();
    }

    public String solicitarPreco() {
        System.out.print("Preco do produto: R$ ");
        return scanner.nextLine();
    }

    public void exibirProduto(Produto produto) {
        String precoFormatado = String.format(Locale.forLanguageTag("pt-BR"), "R$ %.2f", produto.getPreco());
        System.out.println("Nome: " + produto.getNome() + " | Preco: " + precoFormatado);
    }

    public void exibirLista(List<Produto> produtos) {
        System.out.println("\n===== PRODUTOS CADASTRADOS =====");

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        for (Produto produto : produtos) {
            exibirProduto(produto);
        }
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
