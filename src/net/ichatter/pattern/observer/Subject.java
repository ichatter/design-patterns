package net.ichatter.pattern.observer;

/**
 * It's observed
 * 
 * @author yzy
 *
 */
public interface Subject {

	public void addObserver(Observer observer);

	public void deleteObserver(Observer observer);

	/**
	 * notify all observers
	 */
	public void notifyObservers();

	/**
	 * get message from subject,used by observer
	 */
	public String getMessage();

}
