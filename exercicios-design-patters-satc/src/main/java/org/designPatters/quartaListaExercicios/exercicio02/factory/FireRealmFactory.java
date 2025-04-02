package org.designPatters.quartaListaExercicios.exercicio02.factory;

import org.designPatters.quartaListaExercicios.exercicio02.Dragon;
import org.designPatters.quartaListaExercicios.exercicio02.Salamander;
import org.designPatters.quartaListaExercicios.exercicio02.interfaces.Creature;
import org.designPatters.quartaListaExercicios.exercicio02.interfaces.CreatureFactory;

public class FireRealmFactory implements CreatureFactory {
    @Override
    public Creature createStrongCreature() {
        return new Dragon();
    }

    @Override
    public Creature createFastCreature() {
        return new Salamander();
    }
}
