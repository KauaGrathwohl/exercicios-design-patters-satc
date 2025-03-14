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

    private int largura;
    private int altura;

    public void constructor(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public static int calcularAreaRetangulo(int largura, int altura) {
        return largura * altura;
    }
}
