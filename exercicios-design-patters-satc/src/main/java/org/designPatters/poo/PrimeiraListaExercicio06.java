package org.designPatters.poo;

import java.util.ArrayList;
import java.util.List;

public class PrimeiraListaExercicio06 {

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto("Notebook", 3000.00, 10);
        cadastro.adicionarProduto("Mouse", 50.00, 100);
        cadastro.atualizarPrecoProduto("Mouse", 45.00);
        cadastro.adicionarQuantidadeEstoque("Notebook", 5);
        cadastro.removerQuantidadeEstoque("Mouse", 10);
        cadastro.exibirRelatorioProdutos();
    }
}

class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void atualizarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void adicionarQuantidade(int quantidade) {
        this.quantidadeEmEstoque += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        if (this.quantidadeEmEstoque >= quantidade) {
            this.quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + nome + " | Preço: R$" + preco + " | Quantidade em Estoque: " + quantidadeEmEstoque);
    }

    public String getNome() {
        return nome;
    }
}

class CadastroProdutos {
    private List<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, double preco, int quantidadeEmEstoque) {
        produtos.add(new Produto(nome, preco, quantidadeEmEstoque));
        System.out.println("Produto \"" + nome + "\" adicionado.");
    }

    public void atualizarPrecoProduto(String nome, double novoPreco) {
        Produto produto = encontrarProduto(nome);
        if (produto != null) {
            produto.atualizarPreco(novoPreco);
            System.out.println("Preço do produto \"" + nome + "\" atualizado para R$" + novoPreco);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void adicionarQuantidadeEstoque(String nome, int quantidade) {
        Produto produto = encontrarProduto(nome);
        if (produto != null) {
            produto.adicionarQuantidade(quantidade);
            System.out.println("Quantidade do produto \"" + nome + "\" aumentada em " + quantidade);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void removerQuantidadeEstoque(String nome, int quantidade) {
        Produto produto = encontrarProduto(nome);
        if (produto != null) {
            produto.removerQuantidade(quantidade);
            System.out.println("Quantidade do produto \"" + nome + "\" reduzida em " + quantidade);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void exibirRelatorioProdutos() {
        System.out.println("Relatório de Produtos:");
        for (Produto produto : produtos) {
            produto.exibirDetalhes();
        }
    }

    private Produto encontrarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }
}