package net.ichatter.pattern.observer;

import java.util.Vector;

public class Children implements Subject {

	protected boolean changed = false;
	private Vector<Observer> obs;
	protected String message;

	/** Construct an Subject with zero Observers. */
	public Children() {
		obs = new Vector<>();
	}

	@Override
	public synchronized void addObserver(Observer o) {
		if (o == null)
			throw new NullPointerException();
		if (!obs.contains(o)) {
			obs.addElement(o);
		}
	}

	@Override
	public synchronized void deleteObserver(Observer o) {
		obs.removeElement(o);
	}

	@Override
	public void notifyObservers() {
		if (!changed)
			return;
		clearChanged();
		for (Observer o : obs) {
			o.update();
		}
	}

	@Override
	public synchronized String getMessage() {
		return this.message;
	}

	public synchronized void setChanged() {
		this.changed = true;
	}

	public synchronized void clearChanged() {
		this.changed = false;
	}

}
