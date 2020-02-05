package net.ichatter.pattern.abstractfactory;

/**
 * define the abstract factory
 * 
 * @author yzy
 *
 */
public abstract interface VehicleFactory {

	public abstract Car createCar();

	public abstract Bus createBus();

}
