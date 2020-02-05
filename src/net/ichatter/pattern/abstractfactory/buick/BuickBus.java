package net.ichatter.pattern.abstractfactory.buick;

import net.ichatter.pattern.abstractfactory.Bus;

public class BuickBus implements Bus {

	@Override
	public void showBusInfo() {
		System.out.println("I'm a BuickBus.");
	}

}
