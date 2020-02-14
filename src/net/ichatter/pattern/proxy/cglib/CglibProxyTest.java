package net.ichatter.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class CglibProxyTest {

	public static void main(String[] args) {

		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(Car.class);
		enhancer.setCallback(new CarProxy());
		Car car = (Car) enhancer.create();

		// we can see all methods in Car.java are proxied by CarProxy.java
		car.run();
		car.anotherRun();
	}

}
