package net.ichatter.pattern.observer.jdk;

public class ObserverPatternTest {
	public static void main(String[] args) {
		Baby baby = new Baby();// Observable object which is observed
		baby.addObserver(new Mom());// Observer Mom
		baby.addObserver(new Daddy());// Observer Daddy

		baby.goOut();// baby wanna go out
	}
}
