package controller;

import model.Produto;
import view.ProdutoView;

public class ProdutoController {
    private final ProdutoView view;

    public ProdutoController(ProdutoView view) {
        this.view = view;
    }

    public void iniciar() {
        String opcao;

        do {
            opcao = view.solicitarOpcao();

            switch (opcao) {
                case "1":
                    cadastrar();
                    break;
                case "2":
                    listar();
                    break;
                case "0":
                    view.exibirMensagem("Programa encerrado.");
                    break;
                default:
                    view.exibirMensagem("Opcao invalida. Tente novamente.");
            }
        } while (!opcao.equals("0"));
    }

    public void cadastrar() {
        String nome = view.solicitarNome();
        String precoTexto = view.solicitarPreco();

        try {
            double preco = Double.parseDouble(precoTexto.trim().replace(',', '.'));
            Produto produto = new Produto(nome, preco);
            Produto.adicionar(produto);
            view.exibirMensagem("Produto cadastrado com sucesso!");
        } catch (NumberFormatException e) {
            view.exibirMensagem("Preco invalido. Digite um numero, como 19,90.");
        } catch (IllegalArgumentException e) {
            view.exibirMensagem(e.getMessage());
        }
    }

    public void listar() {
        view.exibirLista(Produto.listar());
    }
}
