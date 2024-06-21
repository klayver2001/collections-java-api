package main.java.list.OperacoesBasicas.CarrinhoCompras;

public class Item {
    /* Atributos */
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void exibirInformacoes() {
        this.toString();

    }

    @Override
    public String toString() {
        return " Nome: " + nome + "\nPreço: " + preco + "\nQuantidade: " + quantidade;
    }
}
