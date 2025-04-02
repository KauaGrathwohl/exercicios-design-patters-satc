package org.designPatters.pooUml.exercicios05;

public class Artigo extends Publicacao {
    private int numeroDePalavras;

    public Artigo(String titulo, String autor, String descricao, int numeroDePalavras) {
        super(titulo, autor, descricao);
        this.numeroDePalavras = numeroDePalavras;
    }

    @Override
    public String exibirResumo() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nDescrição: " + descricao + "\nNúmero de Palavras: " + numeroDePalavras;
    }

    // Getters e setters
    public int getNumeroDePalavras() {
        return numeroDePalavras;
    }

    public void setNumeroDePalavras(int numeroDePalavras) {
        this.numeroDePalavras = numeroDePalavras;
    }
}
