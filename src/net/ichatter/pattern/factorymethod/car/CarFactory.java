package net.ichatter.pattern.factorymethod.car;

import net.ichatter.pattern.factorymethod.Vehicle;
import net.ichatter.pattern.factorymethod.VehicleFactory;

/**
 * define the concrete factory <strong>CarFactory</strong>
 * 
 * @author yzy
 *
 */
public class CarFactory implements VehicleFactory {

	@Override
	public Vehicle manufacture() {
		return new Car();
	}

}
