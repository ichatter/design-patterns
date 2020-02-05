package net.ichatter.pattern.abstractfactory.benz;

import net.ichatter.pattern.abstractfactory.Bus;
import net.ichatter.pattern.abstractfactory.Car;
import net.ichatter.pattern.abstractfactory.VehicleFactory;

/**
 * define the concrete factory <strong>BenzFactory</strong>
 * 
 * @author yzy
 *
 */
public class BenzFactory implements VehicleFactory {

	@Override
	public Car createCar() {
		return new BenzCar();
	}

	@Override
	public Bus createBus() {
		return new BenzBus();
	}

}
