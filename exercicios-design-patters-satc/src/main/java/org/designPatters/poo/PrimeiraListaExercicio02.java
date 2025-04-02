package org.designPatters.poo;

import java.util.ArrayList;
import java.util.List;

public class PrimeiraListaExercicio02 {

    /*

    # Exercicio 02

    ## Converta um código que gerencia uma lista de tarefas (to-do list) usando funções para uma versão orientada a objetos.
    ```
    let tarefas: string[] = [];

    function adicionarTarefa(tarefa: string): void {
        tarefas.push(tarefa);
        console.log(`Tarefa "${tarefa}" adicionada.`);
    }

    function listarTarefas(): void {
        console.log("Lista de Tarefas:");
        tarefas.forEach((tarefa, index) => {
            console.log(`${index + 1}. ${tarefa}`);
        });
    }

    function removerTarefa(index: number): void {
        if (index >= 0 && index < tarefas.length) {
            const tarefaRemovida = tarefas.splice(index, 1)[0];
            console.log(`Tarefa "${tarefaRemovida}" removida.`);
        } else {
            console.log("Índice inválido.");
        }
    }

    adicionarTarefa("Estudar TypeScript");
    adicionarTarefa("Fazer exercícios de POO");
    listarTarefas();
    removerTarefa(0);
    listarTarefas();

    */

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.adicionarTarefa("Estudar TypeScript");
        toDoList.adicionarTarefa("Fazer exercícios de POO");
        toDoList.listarTarefas();
        toDoList.removerTarefa(0);
        toDoList.listarTarefas();
    }
}

class ToDoList {
    private List<String> tarefas;

    public ToDoList() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa \"" + tarefa + "\" adicionada.");
    }

    public void listarTarefas() {
        System.out.println("Lista de Tarefas:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }
    }

    public void removerTarefa(int index) {
        if (index >= 0 && index < tarefas.size()) {
            String tarefaRemovida = tarefas.remove(index);
            System.out.println("Tarefa \"" + tarefaRemovida + "\" removida.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}