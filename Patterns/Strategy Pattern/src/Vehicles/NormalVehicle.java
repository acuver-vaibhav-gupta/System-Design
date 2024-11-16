package Vehicles;

import Strategy.NormalDriveStrategyImpl;

public class NormalVehicle extends Vehicle {

    public NormalVehicle(){
        super(new NormalDriveStrategyImpl());
    }
    
}
