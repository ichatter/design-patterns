package net.ichatter.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class Daddy implements Observer {

	@Override
	public void update(Observable o, Object arg) {
//		if(arg instanceof Object[])
		Object[] args = (arg instanceof Object[]) ? (Object[]) arg : null;
		if (args != null && args.length == 3) {
			System.out.println("[Baby]:"+args[0] + "," + args[2]);
			System.out.println("[Daddy]:OK,be careful.");
		}
	}

}
