package net.ichatter.pattern.abstractfactory.buick;

import net.ichatter.pattern.abstractfactory.Bus;
import net.ichatter.pattern.abstractfactory.Car;
import net.ichatter.pattern.abstractfactory.VehicleFactory;

/**
 * define the concrete factory <strong>BuickFactory</strong>
 * 
 * @author yzy
 *
 */
public class BuickFactory implements VehicleFactory {

	@Override
	public Car createCar() {
		return new BuickCar();
	}

	@Override
	public Bus createBus() {
		return new BuickBus();
	}

}
