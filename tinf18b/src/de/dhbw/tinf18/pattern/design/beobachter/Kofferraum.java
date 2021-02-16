package de.dhbw.tinf18.pattern.design.beobachter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kofferraum {
	
	private final List<Öffnungssensor> sensoren;
	
	public Kofferraum() {
		super();
		this.sensoren = Collections.synchronizedList(new ArrayList<>());
	}
	
	public void meldeAn(Öffnungssensor sensor) {
		if (sensor == null) {
			return;
		}
		this.sensoren.add(sensor);
	}
	
	public Iterable<Öffnungssensor> öffnungssensoren() {
		return new ArrayList<Öffnungssensor>(this.sensoren);
		//return Collections.unmodifiableList(this.sensoren);
	}
	
	public void meldeAb(Öffnungssensor sensor) {
		this.sensoren.remove(sensor);
	}

	public void öffne() {
		System.out.println("Klappe auf");
		öffnungssensoren().forEach(sensor -> sensor.zustandAnders(true));
	}
	
	public void schließe() {
		System.out.println("Klappe zu");
		öffnungssensoren().forEach(sensor -> sensor.zustandAnders(false));
	}
}
