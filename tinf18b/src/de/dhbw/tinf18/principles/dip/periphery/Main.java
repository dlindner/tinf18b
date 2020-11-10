package de.dhbw.tinf18.principles.dip.periphery;

import de.dhbw.tinf18.principles.dip.kern.Kern;

public class Main {

	public static void main(String[] args) {
		Kern kern = new Kern(value -> 0);
		//Kern kern = new Kern(new WurzlerZuLibraryAdapter());
		kern.berechne();
	}
}
