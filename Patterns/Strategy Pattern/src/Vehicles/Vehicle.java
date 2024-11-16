package Vehicles;

import Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy obj;

    public Vehicle(DriveStrategy obj){
        this.obj = obj;
    }

    public void drive(){
        obj.drive();
    }
}