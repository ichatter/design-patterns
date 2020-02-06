package net.ichatter.pattern.factorymethod.simplefactory;

/**
 * define the simple factory
 * 
 * @author yzy
 *
 */
public class VehicleFactory {

	public static Vehicle manufacture(int type) {
		if (1 == type) {
			return new Car();
		} else if (2 == type) {
			return new Bus();
		}
		return new Vehicle() {
			@Override
			public void showInfo() {
				System.out.println("Sorry,I'm just an abstract Vehicle.");
			}
		};
	}

}
