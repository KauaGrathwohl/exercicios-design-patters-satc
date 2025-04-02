package org.designPatters.quartaListaExercicios.exercicio03;

import org.designPatters.quartaListaExercicios.exercicio03.interfaces.Vehicle;

public class RoboticExplorer implements Vehicle {
    @Override
    public void propulsionMode() {
        System.out.println("Propulsão: Motor de íons.");
    }

    @Override
    public void controlSystem() {
        System.out.println("Sistema de Controle: Controle Manual.");
    }
}