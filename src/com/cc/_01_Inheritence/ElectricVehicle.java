package com.cc._01_Inheritence;

public class ElectricVehicle extends Vehicle{
	
	private String fuelType;
	private String maxRange;
	
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getMaxRange() {
		return maxRange;
	}
	public void setMaxRange(String maxRange) {
		this.maxRange = maxRange;
	}
	public void recharge()
	{
		System.out.println("Bike is fully recharged");
	}
	
	

}
