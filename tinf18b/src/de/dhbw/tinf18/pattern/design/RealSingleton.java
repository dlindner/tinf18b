package de.dhbw.tinf18.pattern.design;

import java.util.concurrent.Callable;

public enum RealSingleton implements Callable<RealSingleton> {

	instance(132);
	
	private int counter;
	
	public static RealSingleton getInstance() {
		return instance;
	}
	
	private RealSingleton(int anfangsstand) {
		// geht nicht!
		//super();
		this.counter = anfangsstand;
	}
	
	public int getCounter() {
		return this.counter;
	}
	
	@Override
	public RealSingleton call() throws Exception {
		return null;
	}
}
