package net.ichatter.pattern.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * The <b>cglib proxy</b>,we can do something before the car runs,and do
 * something after the car runned. No need to know the method name in the
 * proxied class <b>Car</b>.
 * 
 * @author yzy
 *
 */
public class CarProxy implements MethodInterceptor {

	/**
	 * All generated proxied methods call this method instead of the original
	 * method. The original method may either be invoked by normal reflection using
	 * the Method object, or by using the MethodProxy (faster).
	 * 
	 * @param obj    "this", the enhanced object which is dynamically generated by
	 *               cglib
	 * @param method intercepted Method
	 * @param args   argument array; primitive types are wrapped
	 * @param proxy  used to invoke super (non-intercepted method); may be called as
	 *               many times as needed
	 * @throws Throwable any exception may be thrown; if so, super method will not
	 *                   be invoked
	 * @return any value compatible with the signature of the proxied method. Method
	 *         returning void will ignore this value.
	 * @see MethodProxy
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		// First of all,the driver must inspect the car for defects.
		System.out.println("Before running,the car need to be inspected.");
//		Object result = method.invoke(car, args);
		Object result = proxy.invokeSuper(obj, args);
		System.out.println("After running,the car need to be washed.");
		return result;
	}

}
