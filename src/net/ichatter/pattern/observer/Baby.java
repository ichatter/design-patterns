package net.ichatter.pattern.observer;

public class Baby extends Children {

	public void goOut() {
		this.message = "I wanna go out and play with my friends.";
		this.changed = true;
		this.notifyObservers();
	}
}
