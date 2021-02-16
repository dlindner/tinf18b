package de.dhbw.tinf18.pattern.design.singleton;

public final class EagerSingleton {

	// eager initialization (ASAP)
	private static final EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {
		super();
		try {
			Thread.sleep(1_000L);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
	
	public static EagerSingleton getInstance() {
		// lazy initialization (ALAP)
//		if (null == instance) {
//			instance = new Singleton();
//		}
		return instance;
	}
}
