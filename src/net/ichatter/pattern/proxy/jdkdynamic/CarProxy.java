package net.ichatter.pattern.proxy.jdkdynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * The <b>jdk dynamic proxy</b>,we can do something before the car runs,and do
 * something after the car runned. No need to know the method name in the
 * proxied class <b>Car</b>.
 * 
 * @author yzy
 *
 */
public class CarProxy implements InvocationHandler {

	private Car car;

	public CarProxy(Car car) {
		this.car = car;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// First of all,the driver must inspect the car for defects.
		System.out.println("Before running,the car need to be inspected.");
		Object result = method.invoke(car, args);
		System.out.println("After running,the car need to be washed.");
		return result;
	}

}
