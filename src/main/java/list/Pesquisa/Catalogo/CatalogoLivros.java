package main.java.list.Pesquisa.Catalogo;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    /* Atributos */

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro Um", "Klayver", 1998);
        catalogoLivros.adicionarLivro("Livro Dois", "Joao", 1989);
        catalogoLivros.adicionarLivro("Livro Tres", "Klayver", 2001);
        catalogoLivros.adicionarLivro("Livro Quatro", "Manoel", 1994);
        catalogoLivros.adicionarLivro("Livro Cinco", "Klayver", 1978);
        catalogoLivros.adicionarLivro("Livro Seis", "Joana", 2010);
        catalogoLivros.adicionarLivro("Livro Sete", "Carla", 2004);

        System.out.println(catalogoLivros.pesquisarPorAutor("Klayver"));
        System.out.println();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList)
                if (l.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoFinal && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


}
