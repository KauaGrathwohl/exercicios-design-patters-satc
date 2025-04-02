package org.designPatters.abstractFactory.exercicio03;

import org.designPatters.abstractFactory.exercicio03.factory.EarthVehicleFactory;
import org.designPatters.abstractFactory.exercicio03.factory.SpaceVehicleFactory;
import org.designPatters.abstractFactory.exercicio03.interfaces.Vehicle;
import org.designPatters.abstractFactory.exercicio03.interfaces.VehicleFactory;

public class Client {
    public static void main(String[] args) {
        VehicleFactory earthFactory = new EarthVehicleFactory();
        VehicleFactory spaceFactory = new SpaceVehicleFactory();

        Vehicle earthFlyingVehicle = earthFactory.createFlyingVehicle();
        Vehicle earthGroundVehicle = earthFactory.createGroundVehicle();
        Vehicle spaceFlyingVehicle = spaceFactory.createFlyingVehicle();
        Vehicle spaceGroundVehicle = spaceFactory.createGroundVehicle();

        earthFlyingVehicle.propulsionMode();
        earthFlyingVehicle.controlSystem();
        earthGroundVehicle.propulsionMode();
        earthGroundVehicle.controlSystem();
        spaceFlyingVehicle.propulsionMode();
        spaceFlyingVehicle.controlSystem();
        spaceGroundVehicle.propulsionMode();
        spaceGroundVehicle.controlSystem();
    }
}
