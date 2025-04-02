package org.designPatters.quartaListaExercicios.exercicio02;

import org.designPatters.quartaListaExercicios.exercicio02.interfaces.Creature;

public class Dragon implements Creature {
    @Override
    public void attack() {
        System.out.println("O Dragão lança uma bola de fogo!");
    }
}
