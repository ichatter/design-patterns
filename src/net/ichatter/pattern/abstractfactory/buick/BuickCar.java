package net.ichatter.pattern.abstractfactory.buick;

import net.ichatter.pattern.abstractfactory.Car;

public class BuickCar implements Car {

	@Override
	public void showCarInfo() {
		System.out.println("I'm a BuickCar.");
	}

}
