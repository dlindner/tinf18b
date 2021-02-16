package de.dhbw.tinf18.pattern.design.beobachter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kofferraum {
	
	private final List<�ffnungssensor> sensoren;
	
	public Kofferraum() {
		super();
		this.sensoren = Collections.synchronizedList(new ArrayList<>());
	}
	
	public void meldeAn(�ffnungssensor sensor) {
		if (sensor == null) {
			return;
		}
		this.sensoren.add(sensor);
	}
	
	public Iterable<�ffnungssensor> �ffnungssensoren() {
		return new ArrayList<�ffnungssensor>(this.sensoren);
		//return Collections.unmodifiableList(this.sensoren);
	}
	
	public void meldeAb(�ffnungssensor sensor) {
		this.sensoren.remove(sensor);
	}

	public void �ffne() {
		System.out.println("Klappe auf");
		�ffnungssensoren().forEach(sensor -> sensor.zustandAnders(true));
	}
	
	public void schlie�e() {
		System.out.println("Klappe zu");
		�ffnungssensoren().forEach(sensor -> sensor.zustandAnders(false));
	}
}
