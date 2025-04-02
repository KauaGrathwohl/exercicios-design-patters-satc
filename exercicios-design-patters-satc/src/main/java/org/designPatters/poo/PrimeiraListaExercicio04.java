package org.designPatters.poo;

import java.util.ArrayList;
import java.util.List;

public class PrimeiraListaExercicio04 {

    /*

    # Exercicio 04

    ## Gerenciamento de Tarefas Pessoais
    ### User Story:
    Como um usuário, eu quero poder adicionar tarefas pessoais, marcar tarefas como concluídas e visualizar minha lista de tarefas, para que eu possa organizar meu dia a dia.

    ### Requisitos:

    #### Crie uma classe Tarefa
    Com os atributos
    - descricao (string): Descrição da tarefa.
    - concluida (boolean): Indica se a tarefa foi concluída (inicialmente false).

    Adicione métodos para:
    - Marcar a tarefa como concluída.
    - Exibir os detalhes da tarefa (descrição e status).

    #### Crie uma classe GerenciadorTarefas que gerencia uma lista de tarefas
    Adicione métodos para:
    - Adicionar uma nova tarefa.
    - Marcar uma tarefa como concluída (usando o índice da tarefa na lista).
    - Exibir todas as tarefas (com status).

    Teste o sistema criando algumas tarefas, marcando algumas como concluídas e exibindo a lista de tarefas.

    */

    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        gerenciador.adicionarTarefa("Estudar Java");
        gerenciador.adicionarTarefa("Fazer exercícios de POO");
        gerenciador.exibirTarefas();
        gerenciador.marcarTarefaConcluida(0);
        gerenciador.exibirTarefas();
    }
}

class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void marcarConcluida() {
        this.concluida = true;
    }

    public void exibirDetalhes() {
        System.out.println("Tarefa: " + descricao + " | Concluída: " + (concluida ? "Sim" : "Não"));
    }
}

class GerenciadorTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
        System.out.println("Tarefa \"" + descricao + "\" adicionada.");
    }

    public void marcarTarefaConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).marcarConcluida();
            System.out.println("Tarefa " + (indice + 1) + " marcada como concluída.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void exibirTarefas() {
        System.out.println("Lista de Tarefas:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.print((i + 1) + ". ");
            tarefas.get(i).exibirDetalhes();
        }
    }
}