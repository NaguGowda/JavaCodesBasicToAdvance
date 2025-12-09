package com.abstarctclass;

abstract class Vehicle {
	abstract void accelerate();
	abstract void brake();

	// Concrete method 
	void startEngine() {
		System.out.println("Engine started!");
	}
}

// Concrete implementation (hidden details)
class Car extends Vehicle {
	@Override
	void accelerate() {
		System.out.println("Car: Pressing gas pedal...");
		// Hidden complex logic: fuel injection, gear shifting, etc.
	}

	@Override
	void brake() {
		System.out.println("Car: Applying brakes...");
		// Hidden logic: hydraulic pressure, brake pads, etc.
	}
}

public class AbstractVehivlDeatial {
	public static void main(String[] args) {
		Vehicle myCar = new Car();
		myCar.startEngine();
		myCar.accelerate();
		myCar.brake();
	}
}