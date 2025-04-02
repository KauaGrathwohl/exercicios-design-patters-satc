package org.designPatters.abstractFactory.exercicio03;

import org.designPatters.abstractFactory.exercicio03.interfaces.Vehicle;

public class Spaceship implements Vehicle {
    @Override
    public void propulsionMode() {
        System.out.println("Propulsão: Motor de plasma.");
    }

    @Override
    public void controlSystem() {
        System.out.println("Sistema de Controle: Inteligência Artificial.");
    }
}