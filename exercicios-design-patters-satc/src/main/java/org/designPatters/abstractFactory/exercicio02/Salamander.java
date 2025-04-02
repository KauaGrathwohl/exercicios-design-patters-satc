package org.designPatters.abstractFactory.exercicio02;

import org.designPatters.abstractFactory.exercicio02.interfaces.Creature;

public class Salamander implements Creature {
    @Override
    public void attack() {
        System.out.println("A Salamandra ataca com suas chamas rápidas!");
    }
}
