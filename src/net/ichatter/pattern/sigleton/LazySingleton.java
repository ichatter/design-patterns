package net.ichatter.pattern.sigleton;

public class LazySingleton {

	private static LazySingleton instance = null;

	private LazySingleton() {
	}

	/**
	 * To avoid this extra overhead every time, double checked locking principle is
	 * used. In this approach, the synchronized block is used inside the <b>if
	 * condition</b> with an additional check to ensure that only one instance of a
	 * singleton class is created.
	 * 
	 * @return
	 */
	public static LazySingleton getInstance() {
		if (instance == null) {// 1st check
			synchronized (LazySingleton.class) {
				if (instance == null) {// 2nd check
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
}
