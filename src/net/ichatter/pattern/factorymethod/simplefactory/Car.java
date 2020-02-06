package net.ichatter.pattern.factorymethod.simplefactory;

public class Car implements Vehicle {

	@Override
	public void showInfo() {
		System.out.println("I'm a Car.");
	}
}
