package net.ichatter.pattern.observer;

/**
 * Observe the Subject
 * 
 * @author yzy
 *
 */
public interface Observer {

	/**
	 * method to update the observer, used by subject
	 */
	public void update();
}
