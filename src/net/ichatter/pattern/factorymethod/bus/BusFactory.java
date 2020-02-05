package net.ichatter.pattern.factorymethod.bus;

import net.ichatter.pattern.factorymethod.Vehicle;
import net.ichatter.pattern.factorymethod.VehicleFactory;

/**
 * define the concrete factory <strong>BusFactory</strong>
 * 
 * @author yzy
 *
 */
public class BusFactory implements VehicleFactory {

	@Override
	public Vehicle manufacture() {
		return new Bus();
	}

}
