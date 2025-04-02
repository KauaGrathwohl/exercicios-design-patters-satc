package org.designPatters.abstractFactory.exercicio03.factory;

import org.designPatters.abstractFactory.exercicio03.RoboticExplorer;
import org.designPatters.abstractFactory.exercicio03.Spaceship;
import org.designPatters.abstractFactory.exercicio03.interfaces.Vehicle;
import org.designPatters.abstractFactory.exercicio03.interfaces.VehicleFactory;

public class SpaceVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createFlyingVehicle() {
        return new Spaceship();
    }

    @Override
    public Vehicle createGroundVehicle() {
        return new RoboticExplorer();
    }
}