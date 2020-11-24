package de.dhbw.tinf18.pattern.design;

public enum RealSingleton {

	instance(132);
	
	private int counter;
	
	private RealSingleton(int anfangsstand) {
		// geht nicht!
		//super();
		this.counter = anfangsstand;
	}
	
	public int getCounter() {
		return this.counter;
	}
}
