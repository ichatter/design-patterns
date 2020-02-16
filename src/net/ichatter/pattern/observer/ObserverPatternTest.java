package net.ichatter.pattern.observer;

public class ObserverPatternTest {
	public static void main(String[] args) {
		Daddy daddy = new Daddy();
		Mom mom = new Mom();
		Baby baby = new Baby();// Observable object which is observed
		
		baby.addObserver(daddy);// Observer Daddy
		baby.addObserver(mom);// Observer Mom
		
		daddy.setSubject(baby);
		mom.setSubject(baby);

		baby.goOut();// baby wanna go out
	}
}
