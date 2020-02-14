package net.ichatter.pattern.proxy.statics;

public class Car implements Vehicle {

	@Override
	public void run() {
		System.out.println("Now the car is running on the road.");
	}

}
