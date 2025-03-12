package org.designPatters.segundaListaExercicios.exercicios05;

public class Video extends Publicacao {
    private String duracao;

    public Video(String titulo, String autor, String descricao, String duracao) {
        super(titulo, autor, descricao);
        this.duracao = duracao;
    }

    @Override
    public String exibirResumo() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nDescrição: " + descricao + "\nDuração: " + duracao;
    }

    // Getters e setters

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}