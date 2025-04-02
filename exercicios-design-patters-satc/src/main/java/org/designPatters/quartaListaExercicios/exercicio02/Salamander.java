package org.designPatters.quartaListaExercicios.exercicio02;

import org.designPatters.quartaListaExercicios.exercicio02.interfaces.Creature;

public class Salamander implements Creature {
    @Override
    public void attack() {
        System.out.println("A Salamandra ataca com suas chamas rápidas!");
    }
}
