package Vehicles;

import Strategy.SpecialDriveStrategyImpl;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle(){
        super(new SpecialDriveStrategyImpl());
    }
    
}