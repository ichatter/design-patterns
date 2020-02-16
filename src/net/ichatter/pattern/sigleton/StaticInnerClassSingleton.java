package net.ichatter.pattern.sigleton;

/**
 * When the StaticInnerClassSingleton class is loaded, SingletonHelper class
 * will not be loaded into memory unless
 * {@link #StaticInnerClassSingleton.getInstance()} is invoked.
 * 
 * @author yzy
 *
 */
public class StaticInnerClassSingleton {

	private StaticInnerClassSingleton() {
	}

	private static class SingletonHelper {
		private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
	}

	public static StaticInnerClassSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
