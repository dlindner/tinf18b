package de.dhbw.tinf18.calisthenics;

public class KeinElse {

	public static void main(String[] args) {
		System.out.println(istGerade(17));
		System.out.println(istGerade(24));
	}
	
	private static String istGerade(int wert) {
		if (wert % 2 == 0) {
			return "Gerade";
		}
		return "Ungerade";
	}
}
