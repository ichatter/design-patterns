package net.ichatter.pattern.observer;

public class Mom extends Parent {

	@Override
	public void update() {
		System.out.println("[Baby]:" + this.getSubject().getMessage());
		System.out.println("[Mom]:OK,but you must come back before PM 5:00.");
	}

}
