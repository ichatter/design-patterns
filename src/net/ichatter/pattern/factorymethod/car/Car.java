package net.ichatter.pattern.factorymethod.car;

import net.ichatter.pattern.factorymethod.Vehicle;

public class Car implements Vehicle {

	@Override
	public void showInfo() {
		System.out.println("I'm a Car.");
	}
}
