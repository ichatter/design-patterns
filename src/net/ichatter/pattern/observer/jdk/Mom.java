package net.ichatter.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class Mom implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		Object[] args = (arg instanceof Object[]) ? (Object[]) arg : null;
		if (args != null && args.length == 3) {
			System.out.println("[Baby]:" + args[1] + "," + args[2]);
			System.out.println("[Mom]:OK,but you must come back before PM 5:00.");
		}
	}

}
