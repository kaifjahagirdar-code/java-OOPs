package com.cc._01_Inheritence;

public class VehicleDemo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Vehicle v1= new Vehicle();
         
         v1.setWheels(2);
         v1.setMaxSpeed(100);
         v1.setBrakingSystem("Hydraulic");
         v1.setColor("Black");
         
         System.out.println("Number of Wheels= "+v1.getWheels());
         System.out.println("Max Speed of a Vehicle= "+v1.getMaxSpeed());
         System.out.println("Braking System= "+v1.getBrakingSystem());
         System.out.println("Colour of Vehicle= "+v1.getColor());
         
         v1.start();
         v1.stop();
         
         Bike b1= new Bike();
         
         b1.setEngineType("Diesel");
         b1.setIgnitionType("4 stroke Engine");
         
         System.out.println("Engine Type of a Vehicle= "+b1.getEngineType());
         System.out.println("Ignition Type of a Vehicle= "+b1.getIgnitionType());
         b1.start();
         b1.stop();
         b1.wash();
         
         ElectricVehicle ev1= new ElectricVehicle();
         
         ev1.setFuelType("Petrol");
         ev1.setMaxRange("100 km");
         
         System.out.println("Fuel Type= "+ev1.getFuelType());
         System.out.println("Max Range= "+ev1.getMaxRange());
         
         ev1.recharge();
         
         
         
         
         
         
	}

}
