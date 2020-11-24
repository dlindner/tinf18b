package de.dhbw.tinf18.pattern.design;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<EagerSingleton> eins = EagerSingleton::getInstance; 
		Callable<EagerSingleton> zwei = EagerSingleton::getInstance;
		
		ExecutorService concurrentWorker = Executors.newFixedThreadPool(2);
		Future<EagerSingleton> futureEins = concurrentWorker.submit(eins);
		Future<EagerSingleton> futureZwei = concurrentWorker.submit(zwei);
		
		concurrentWorker.shutdown();
		
		System.out.println(futureEins.get());
		System.out.println(futureZwei.get());
		
		RealSingleton[] values = RealSingleton.values();
		
		RealSingleton mySingleton = RealSingleton.getInstance();
		
//		LazySingleton eins = LazySingleton.getInstance();
//		LazySingleton zwei = LazySingleton.getInstance();
//		System.out.println(eins == zwei);
	}

/*
		Supplier<LazySingleton> supplier = () -> LazySingleton.getInstance();
		Callable<LazySingleton> zero = new Callable<LazySingleton>() {
			@Override
			public LazySingleton call() throws Exception {
				return LazySingleton.getInstance();
			}
		};
		Callable<LazySingleton> eins = () -> LazySingleton.getInstance(); 
		Callable<LazySingleton> zwei = LazySingleton::getInstance;
 */
}
