package net.ichatter.pattern.abstractfactory.benz;

import net.ichatter.pattern.abstractfactory.Bus;

public class BenzBus implements Bus {

	@Override
	public void showBusInfo() {
		System.out.println("I'm a BenzBus.");
	}

}
