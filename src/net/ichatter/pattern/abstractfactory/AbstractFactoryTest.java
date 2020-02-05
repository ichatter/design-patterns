package net.ichatter.pattern.abstractfactory;

import net.ichatter.pattern.abstractfactory.benz.BenzFactory;
import net.ichatter.pattern.abstractfactory.buick.BuickFactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		// start the Benz Factory
		VehicleFactory factory = new BenzFactory();
		Bus bus = factory.createBus();
		Car car = factory.createCar();
		bus.showBusInfo();
		car.showCarInfo();

		// start the Buick Factory
		factory = new BuickFactory();
		bus = factory.createBus();
		car = factory.createCar();
		bus.showBusInfo();
		car.showCarInfo();
	}
}
