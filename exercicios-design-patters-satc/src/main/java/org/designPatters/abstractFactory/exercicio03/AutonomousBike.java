package org.designPatters.abstractFactory.exercicio03;

import org.designPatters.abstractFactory.exercicio03.interfaces.Vehicle;

public class AutonomousBike implements Vehicle {
    @Override
    public void propulsionMode() {
        System.out.println("Propulsão: Motor elétrico.");
    }

    @Override
    public void controlSystem() {
        System.out.println("Sistema de Controle: Controle Manual.");
    }
}
