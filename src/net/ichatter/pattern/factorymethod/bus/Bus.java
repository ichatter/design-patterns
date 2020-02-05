package net.ichatter.pattern.factorymethod.bus;

import net.ichatter.pattern.factorymethod.Vehicle;

public class Bus implements Vehicle {

	@Override
	public void showInfo() {
		System.out.println("I'm a Bus.");
	}
}
