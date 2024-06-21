package main.java.list.OperacoesBasicas.ListaTarefas;

public class Tarefa {
    /* atributo */

    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public String toString() {
        return  descricao ;

    }
}
