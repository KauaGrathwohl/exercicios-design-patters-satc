package org.designPatters.quartaListaExercicios.exercicio02.factory;

import org.designPatters.quartaListaExercicios.exercicio02.SeaSerpent;
import org.designPatters.quartaListaExercicios.exercicio02.Triton;
import org.designPatters.quartaListaExercicios.exercicio02.interfaces.Creature;
import org.designPatters.quartaListaExercicios.exercicio02.interfaces.CreatureFactory;

public class WaterRealmFactory implements CreatureFactory {
    @Override
    public Creature createStrongCreature() {
        return new SeaSerpent();
    }

    @Override
    public Creature createFastCreature() {
        return new Triton();
    }
}
