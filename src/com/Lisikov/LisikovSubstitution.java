package com.Lisikov;

import java.util.Vector;
class Vehicle {
    public void start(){
        System.out.println("Starting a vehicle");
    }

    public void stop(){
        System.out.println("Stopping a vehicle");
    }
}

class Bike extends Vehicle{
    public void start(){
        System.out.println("Starting a Bike");
    }

    public void stop(){
        System.out.println("Stopping a Bike");
    }
}

class Car extends Vehicle{
    public void start(){
        System.out.println("Starting a Car");
    }

    public void stop(){
        System.out.println("Stopping a Car");
    }
}


public class LisikovSubstitution {

    static  void TestDrive(Vehicle vehicle){
        vehicle.start();
        vehicle.stop();
    }

    public static void main(String[] args) {
        TestDrive(new Vehicle());
        TestDrive(new Bike());
        TestDrive(new Car());
    }
}
