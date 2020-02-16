package net.ichatter.pattern.observer;

public class Daddy extends Parent {

	@Override
	public void update() {
		System.out.println("[Baby]:" + this.getSubject().getMessage());
		System.out.println("[Daddy]:OK,be careful.");
	}

}
