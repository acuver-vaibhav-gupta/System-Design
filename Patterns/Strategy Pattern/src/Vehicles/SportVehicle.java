package Vehicles;

import Strategy.SpecialDriveStrategyImpl;

public class SportVehicle extends Vehicle {

    public SportVehicle(){
        super(new SpecialDriveStrategyImpl());
    }
    
}