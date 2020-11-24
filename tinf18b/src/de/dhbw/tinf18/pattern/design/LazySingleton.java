package de.dhbw.tinf18.pattern.design;

public final class LazySingleton {

	private static final Object lock = new Object();
	private static LazySingleton instance = null;
	
	private LazySingleton() {
		super();
		try {
			Thread.sleep(1_000L);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
	
	// acquire lock (welches?)
	public static LazySingleton getInstance() {
		synchronized (lock) {
			// lazy initialization (ALAP)
			if (null == instance) {
				instance = new LazySingleton();
			}
			return instance;
		}
	}
	// release lock
}
