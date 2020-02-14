package net.ichatter.pattern.proxy.jdkdynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CarProxyTest {

	public static void main(String[] args) {
		Car car = new Car();
		CarProxy carProxy = new CarProxy(car);

		// method 1:
		// use the proxy class CarProxy which implemented the InvocationHandler
		// interface
		Vehicle v = (Vehicle) Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(),
				carProxy);

		// method 2:
		// no need to define the proxy class CarProxy,just define an anonymous inner
		// class which implemented the interface InvocationHandler
//		Vehicle v = (Vehicle) Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(),
//				new InvocationHandler() {
//
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//						// First of all,the driver must inspect the car for defects.
//						System.out.println("Before running,the car need to be inspected.");
//						Object result = method.invoke(car, args);
//						System.out.println("After running,the car need to be washed.");
//						return result;
//					}
//				});

		// method 2:just lambda expression for method 2.
		Vehicle v2 = (Vehicle) Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(),
				(proxy, method, args2) -> {
					// First of all,the driver must inspect the car for defects.
					System.out.println("Before running,the car need to be inspected.");
					Object result = method.invoke(car, args2);
					System.out.println("After running,the car need to be washed.");
					return result;
				});

		// invoke the run method
		v.run();
		v2.run();
	}

}
