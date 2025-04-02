package org.designPatters.quartaListaExercicios.exercicio03;

import org.designPatters.quartaListaExercicios.exercicio03.interfaces.Vehicle;

public class FlyingCar implements Vehicle {
    @Override
    public void propulsionMode() {
        System.out.println("Propulsão: Motor a jato.");
    }

    @Override
    public void controlSystem() {
        System.out.println("Sistema de Controle: Inteligência Artificial.");
    }
}
