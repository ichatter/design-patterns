package net.ichatter.pattern.factorymethod.simplefactory;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		Vehicle car = VehicleFactory.manufacture(1);
		Vehicle bus = VehicleFactory.manufacture(2);
		Vehicle v = VehicleFactory.manufacture(3);
		car.showInfo();
		bus.showInfo();
		v.showInfo();
	}
}
