package net.ichatter.pattern.proxy.statics;

public class CarProxyTest {

	public static void main(String[] args) {
		Car car = new Car();
		CarProxy proxy = new CarProxy(car);

		proxy.run();
	}

}
