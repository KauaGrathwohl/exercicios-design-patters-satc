package org.designPatters.abstractFactory.exercicio02;

import org.designPatters.abstractFactory.exercicio02.interfaces.Creature;

public class SeaSerpent implements Creature {
    @Override
    public void attack() {
        System.out.println("A Serpente Marinha ataca com uma onda poderosa!");
    }
}
