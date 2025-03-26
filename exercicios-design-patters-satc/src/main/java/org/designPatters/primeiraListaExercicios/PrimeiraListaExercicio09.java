package org.designPatters.primeiraListaExercicios;

public class PrimeiraListaExercicio09 {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        Relatorio pdfRelatorio = new PdfRelatorio();
        Relatorio excelRelatorio = new ExcelRelatorio();
        Relatorio htmlRelatorio = new HtmlRelatorio();

        String[] dados = {"Dado1", "Dado2", "Dado3"};

        gerente.solicitarRelatorio(pdfRelatorio, dados);
        gerente.solicitarRelatorio(excelRelatorio, dados);
        gerente.solicitarRelatorio(htmlRelatorio, dados);
    }
}

interface Relatorio {
    void gerar(String[] dados);
}

class PdfRelatorio implements Relatorio {
    @Override
    public void gerar(String[] dados) {
        System.out.println("Gerando relatório em PDF com os dados: " + String.join(", ", dados));
    }
}

class ExcelRelatorio implements Relatorio {
    @Override
    public void gerar(String[] dados) {
        System.out.println("Gerando relatório em Excel com os dados: " + String.join(", ", dados));
    }
}

class HtmlRelatorio implements Relatorio {
    @Override
    public void gerar(String[] dados) {
        System.out.println("Gerando relatório em HTML com os dados: " + String.join(", ", dados));
    }
}

class Gerente {
    public void solicitarRelatorio(Relatorio relatorio, String[] dados) {
        relatorio.gerar(dados);
    }
}