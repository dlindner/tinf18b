package de.dhbw.tinf18.pattern.design.beobachter;

public class Warnleuchte implements Öffnungssensor {

	public Warnleuchte() {
		super();
	}
	
	@Override
	public void zustandAnders(boolean istOffen) {
		if (istOffen) {
			System.out.println("Warnlicht an");
			return;
		}
		System.out.println("Warnlicht aus");
	}
}
