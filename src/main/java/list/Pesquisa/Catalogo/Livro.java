package main.java.list.Pesquisa.Catalogo;

public class Livro {
    /* Atributos */
    private String titulo;
    private String autor;
    private int anoPublicacao;

    /* Construtor que define os atributos para o Objeto Livro a ser criado ...*/
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    /* Getters para recuperar os valores posteriormente */
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Titulo " + titulo + " Autor do Livro " + autor + " Ano de publicação " + anoPublicacao;
    }
}
