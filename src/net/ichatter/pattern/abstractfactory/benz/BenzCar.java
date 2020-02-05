package net.ichatter.pattern.abstractfactory.benz;

import net.ichatter.pattern.abstractfactory.Car;

public class BenzCar implements Car {

	@Override
	public void showCarInfo() {
		System.out.println("I'm a BenzCar.");
	}

}
