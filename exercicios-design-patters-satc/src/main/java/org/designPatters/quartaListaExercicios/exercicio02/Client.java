package org.designPatters.quartaListaExercicios.exercicio02;

import org.designPatters.quartaListaExercicios.exercicio02.factory.FireRealmFactory;
import org.designPatters.quartaListaExercicios.exercicio02.factory.WaterRealmFactory;
import org.designPatters.quartaListaExercicios.exercicio02.interfaces.Creature;
import org.designPatters.quartaListaExercicios.exercicio02.interfaces.CreatureFactory;

public class Client {
    public static void main(String[] args) {
        CreatureFactory fireRealmFactory = new FireRealmFactory();
        CreatureFactory waterRealmFactory = new WaterRealmFactory();

        Creature fireStrongCreature = fireRealmFactory.createStrongCreature();
        Creature fireFastCreature = fireRealmFactory.createFastCreature();
        Creature waterStrongCreature = waterRealmFactory.createStrongCreature();
        Creature waterFastCreature = waterRealmFactory.createFastCreature();

        fireStrongCreature.attack();
        fireFastCreature.attack();
        waterStrongCreature.attack();
        waterFastCreature.attack();
    }
}
