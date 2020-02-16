package net.ichatter.pattern.observer.jdk;

import java.util.Observable;

public class Baby extends Observable {

	public void goOut() {
		setChanged();
		notifyObservers(new String[] { "Daddy", "Mom", "I wanna go out and play with my friends." });
	}
}
