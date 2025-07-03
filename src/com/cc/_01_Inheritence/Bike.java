package com.cc._01_Inheritence;

public class Bike extends Vehicle {
	
	private String engineType;
	private String ignitionType;
	
	
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getIgnitionType() {
		return ignitionType;
	}
	public void setIgnitionType(String ignitionType) {
		this.ignitionType = ignitionType;
	}
	
	public void wash() {
		System.out.println("Bike is washed");
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Bike Started");
	}
	@Override
	public void stop() {
		System.out.println("Bike Stopped");
	}
	
	
	
	
	
	

}
