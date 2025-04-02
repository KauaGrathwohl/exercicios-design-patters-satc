package org.designPatters.quartaListaExercicios.exercicio01;

import org.designPatters.quartaListaExercicios.exercicio01.factory.PlasticToyFactory;
import org.designPatters.quartaListaExercicios.exercicio01.factory.WoodenToyFactory;
import org.designPatters.quartaListaExercicios.exercicio01.interfaces.Toy;
import org.designPatters.quartaListaExercicios.exercicio01.interfaces.ToyFactory;

public class Client {
    public static void main(String[] args) {
        ToyFactory plasticFactory = new PlasticToyFactory();
        ToyFactory woodenFactory = new WoodenToyFactory();

        Toy plasticCar = plasticFactory.createCar();
        Toy plasticDoll = plasticFactory.createDoll();
        Toy woodenCar = woodenFactory.createCar();
        Toy woodenDoll = woodenFactory.createDoll();

        plasticCar.play();
        plasticDoll.play();
        woodenCar.play();
        woodenDoll.play();
    }
}
