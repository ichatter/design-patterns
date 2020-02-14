package net.ichatter.pattern.proxy.statics;

/**
 * <p>
 * The simple static proxy,we can do something before the car runs,and do
 * something after the car runned.
 * <p>
 * But it's hard-coded,if we do someting more or change the <code>before</code>
 * and <code>after</code> action,we have to modify this proxy class.
 * 
 * @author yzy
 *
 */
public class CarProxy implements Vehicle {

	private Car car;

	public CarProxy(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		// First of all,the driver must inspect the car for defects.
		System.out.println("Before running,the car need to be inspected.");
		car.run();
		System.out.println("After running,the car need to be washed.");
	}

}
