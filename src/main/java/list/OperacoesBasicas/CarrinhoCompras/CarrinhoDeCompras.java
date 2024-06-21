package main.java.list.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    /* Atributo */
    private List<Item> listaCompras;

    public CarrinhoDeCompras(){
        this.listaCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaCompras.add(new Item(nome,preco,quantidade));
    }

    public void removerItem (String nome){
        List<Item> itemParaRemover = new ArrayList<>();

        for (Item i: listaCompras){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        listaCompras.removeAll(itemParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal=0.0;
        for (Item i : listaCompras){
            valorTotal +=i.getPreco() * i.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens(){
        if (listaCompras.isEmpty()){
            System.out.println("O carrinho está vazio");
        } else {
            for (Item i :listaCompras){

                System.out.println(i.toString());
                System.out.println("----------------");
            }
        }
        System.out.println(listaCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Arroz", 10.99, 1);
        carrinho.adicionarItem("Feijão", 8.49, 2);
        carrinho.adicionarItem("Maça", 12.80, 5);

        System.out.println("Itens no carrinho:");
        carrinho.exibirItens();

        System.out.println("Valor total: R$ " + carrinho.calcularValorTotal());

        carrinho.removerItem("Arroz");

        System.out.println("Itens no carrinho após remoção:");
        carrinho.exibirItens();

        System.out.println("Valor total após remoção: R$ " + carrinho.calcularValorTotal());
    }
}

