package org.designPatters.quartaListaExercicios.exercicio02;

import org.designPatters.quartaListaExercicios.exercicio02.interfaces.Creature;

public class SeaSerpent implements Creature {
    @Override
    public void attack() {
        System.out.println("A Serpente Marinha ataca com uma onda poderosa!");
    }
}
