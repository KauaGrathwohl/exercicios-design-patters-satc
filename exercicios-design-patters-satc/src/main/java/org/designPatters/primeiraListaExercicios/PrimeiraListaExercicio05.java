package org.designPatters.primeiraListaExercicios;

public class PrimeiraListaExercicio05 {

    public static void main(String[] args) {
        Retangulos retangulos = new Retangulos(10, 5);
        retangulos.exibirDetalhes();

        Circulo circulo = new Circulo(7);
        circulo.exibirDetalhes();
    }
}

class Retangulos {
    private double largura;
    private double altura;

    public Retangulos(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public void exibirDetalhes() {
        System.out.println("Retângulo:");
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}

class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public void exibirDetalhes() {
        System.out.println("Círculo:");
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}