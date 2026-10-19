package model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private final String nome;
    private final double preco;
    private static final List<Produto> produtos = new ArrayList<>();

    public Produto(String nome, double preco) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto nao pode estar vazio.");
        }

        if (!Double.isFinite(preco) || preco < 0) {
            throw new IllegalArgumentException("O preco deve ser um numero maior ou igual a zero.");
        }

        this.nome = nome.trim();
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public static void adicionar(Produto produto) {
        produtos.add(produto);
    }

    public static List<Produto> listar() {
        return new ArrayList<>(produtos);
    }
}
