package net.ichatter.pattern.factorymethod;

import net.ichatter.pattern.factorymethod.bus.BusFactory;
import net.ichatter.pattern.factorymethod.car.CarFactory;

public class FactoryMethodTest {

	public static void main(String[] args) {
		// start the Car Factory
		VehicleFactory factory = new CarFactory();
		Vehicle v = factory.manufacture();
		v.showInfo();

		// start the Bus Factory
		factory = new BusFactory();
		v = factory.manufacture();
		v.showInfo();
	}
}
