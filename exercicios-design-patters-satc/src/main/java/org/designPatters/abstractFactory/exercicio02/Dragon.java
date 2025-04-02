package org.designPatters.abstractFactory.exercicio02;

import org.designPatters.abstractFactory.exercicio02.interfaces.Creature;

public class Dragon implements Creature {
    @Override
    public void attack() {
        System.out.println("O Dragão lança uma bola de fogo!");
    }
}
