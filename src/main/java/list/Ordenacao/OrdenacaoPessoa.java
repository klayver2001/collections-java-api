package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private final List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Klayver", 23, 1.75);
        ordenacaoPessoa.adicionarPessoa("Julia", 19, 1.65);
        ordenacaoPessoa.adicionarPessoa("Teodoro", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Flavia", 30, 1.69);
        ordenacaoPessoa.adicionarPessoa("Josi", 22, 1.71);

        System.out.println("Ordem por Idade " + ordenacaoPessoa.ordenarPorIdade());
        System.out.println("Ordem por Altura " + ordenacaoPessoa.ordenarPorAltura());
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
}
