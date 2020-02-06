package net.ichatter.pattern.factorymethod.simplefactory;

public class Bus implements Vehicle {

	@Override
	public void showInfo() {
		System.out.println("I'm a Bus.");
	}
}
