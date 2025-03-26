package org.designPatters.primeiraListaExercicios;

public class PrimeiraListaExercicio01 {

    /*

    # Exercicio 01

    ## Converta um código que calcula a área de um retângulo usando funções para uma versão orientada a objetos.

    function calcularAreaRetangulo(largura: number, altura: number): number {
        return largura * altura;
    }

    function exibirArea(largura: number, altura: number): void {
        const area = calcularAreaRetangulo(largura, altura);
        console.log(`A área do retângulo é: ${area}`);
    }

    console.log(exibirArea(10, 5)); // Saída: A área do retângulo é: 50

    */

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10, 5);
        retangulo.exibirArea();
    }
}

class Retangulo {
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public int calcularArea() {
        return largura * altura;
    }

    public void exibirArea() {
        int area = calcularArea();
        System.out.println("A área do retângulo é: " + area);
    }
}
