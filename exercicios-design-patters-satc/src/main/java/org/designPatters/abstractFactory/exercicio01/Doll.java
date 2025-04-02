package org.designPatters.abstractFactory.exercicio01;

import org.designPatters.abstractFactory.exercicio01.interfaces.Toy;

public class Doll implements Toy {
    @Override
    public void play() {
        System.out.println("Brincando com uma boneca.");
    }
}
