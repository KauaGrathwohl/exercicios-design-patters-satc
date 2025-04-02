package org.designPatters.abstractFactory.exercicio02;

import org.designPatters.abstractFactory.exercicio02.interfaces.Creature;

public class Triton implements Creature {
    @Override
    public void attack() {
        System.out.println("O Tritão ataca com sua lança aquática!");
    }
}