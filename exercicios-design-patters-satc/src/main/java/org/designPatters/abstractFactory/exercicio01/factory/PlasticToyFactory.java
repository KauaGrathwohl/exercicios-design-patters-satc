package org.designPatters.abstractFactory.exercicio01.factory;

import org.designPatters.abstractFactory.exercicio01.Car;
import org.designPatters.abstractFactory.exercicio01.Doll;
import org.designPatters.abstractFactory.exercicio01.interfaces.Toy;
import org.designPatters.abstractFactory.exercicio01.interfaces.ToyFactory;

public class PlasticToyFactory implements ToyFactory {
    @Override
    public Toy createCar() {
        return new Car() {
            @Override
            public void play() {
                System.out.println("Brincando com um carrinho de plástico.");
            }
        };
    }

    @Override
    public Toy createDoll() {
        return new Doll() {
            @Override
            public void play() {
                System.out.println("Brincando com uma boneca de plástico.");
            }
        };
    }
}
