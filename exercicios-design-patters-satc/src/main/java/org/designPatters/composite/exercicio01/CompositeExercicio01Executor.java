package org.designPatters.composite.exercicio01;

public class CompositeExercicio01Executor {
    public static void main(String[] args) {
        // Pessoas
        Person ana = new Person("Ana", "ana@email.com");
        Person joao = new Person("João", "joao@email.com");
        Person carla = new Person("Carla", "carla@email.com");
        Person mario = new Person("Mario", "mario@email.com");
        Person lucas = new Person("Lucas", "lucas@email.com");

        // Grupos
        Group primos = new Group("Primos");
        primos.add(joao);
        primos.add(carla);

        Group familia = new Group("Família");
        familia.add(ana);
        familia.add(primos);

        Group devTeam = new Group("Equipe de Desenvolvimento");
        devTeam.add(mario);
        devTeam.add(lucas);

        Group trabalho = new Group("Colegas de Trabalho");
        trabalho.add(devTeam);

        Group contatos = new Group("Meus Contatos");
        contatos.add(familia);
        contatos.add(trabalho);

        // Exibir estrutura
        System.out.println("Estrutura de Contatos:");
        contatos.showDetails("");

        // Buscar
        String nomeBusca = "Lucas";
        System.out.println("\nBuscando por '" + nomeBusca + "'...");
        boolean encontrado = contatos.search(nomeBusca);
        System.out.println(encontrado ? "Contato encontrado!" : "Contato não encontrado.");
    }
}
