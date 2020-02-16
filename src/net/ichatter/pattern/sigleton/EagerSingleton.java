package net.ichatter.pattern.sigleton;

/**
 * It has a drawback that instance is created even though client application
 * might not be using it, and this instance will occupy some memory space.
 * 
 * 
 * @author yzy
 *
 */
public class EagerSingleton {

	private static final EagerSingleton INSTANCE = new EagerSingleton();// a constant

	// also we can define the instantiation in a static block
//	static {
//		INSTANCE = new EagerSingleton();
//	}

	// private constructor to avoid client applications to use constructor
	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return INSTANCE;
	}
}
