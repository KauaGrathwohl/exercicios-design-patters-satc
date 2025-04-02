package org.designPatters.pooUml.exercicios05;

public abstract class Publicacao {
    protected String titulo;
    protected String autor;
    protected String descricao;

    public Publicacao(String titulo, String autor, String descricao) {
        this.titulo = titulo;
        this.autor = autor;
        this.descricao = descricao;
    }

    public abstract String exibirResumo();

    // Getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
