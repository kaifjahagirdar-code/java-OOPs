package com.cc._01_Inheritence;

public class Vehicle {
	
		  private int wheels;
		  private int maxSpeed;
		  private String brakingSystem;
		  private String color;
		  
		public int getWheels() {
			return wheels;
		}
		public void setWheels(int wheels) {
			this.wheels = wheels;
		}
		public int getMaxSpeed() {
			return maxSpeed;
		}
		public void setMaxSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
		}
		public String getBrakingSystem() {
			return brakingSystem;
		}
		public void setBrakingSystem(String brakingSystem) {
			this.brakingSystem = brakingSystem;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		public void start() {
			System.out.println("Vehicle has been Started");
		}
		
		public void stop() {
			System.out.println("Vehicle has been Stopped");
		}
		  
		  
		  
	}