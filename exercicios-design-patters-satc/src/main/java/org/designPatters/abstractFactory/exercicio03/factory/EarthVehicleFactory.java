package org.designPatters.abstractFactory.exercicio03.factory;

import org.designPatters.abstractFactory.exercicio03.AutonomousBike;
import org.designPatters.abstractFactory.exercicio03.FlyingCar;
import org.designPatters.abstractFactory.exercicio03.interfaces.Vehicle;
import org.designPatters.abstractFactory.exercicio03.interfaces.VehicleFactory;

public class EarthVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createFlyingVehicle() {
        return new FlyingCar();
    }

    @Override
    public Vehicle createGroundVehicle() {
        return new AutonomousBike();
    }
}
