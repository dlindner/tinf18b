package de.dhbw.tinf18.pattern.design.dekorierer;

public class Main {

	public static void main(String[] args) {
		Mensch samuel = new Mensch();
		Hund bello = new Hund();
		
		samuel.tueEtwas();
		bello.tueEtwas();
		
		System.out.println("-----------------");
		
		Lebewesen zwiebel = samuel;
		zwiebel = new Pullover(zwiebel);
		LebewesenDekorierer vorletzte = new Nasenöl(zwiebel);
		zwiebel = vorletzte;
		zwiebel = new Nasenöl(zwiebel);
		zwiebel = new FFP2Maske(zwiebel);
		zwiebel = new FFP2Maske(zwiebel);
		
		FFP2Maske hundemaske = new FFP2Maske(bello);
		
		zwiebel.tueEtwas();
		System.out.println("----");
		hundemaske.tueEtwas();
		
		System.out.println("----");
		zwiebel = new FFP2Maske(zwiebel);
		zwiebel.tueEtwas();
		
		System.out.println("----");
		zwiebel = new FFP2Maske(zwiebel);
		zwiebel.tueEtwas();
		
		System.out.println("**************");
		vorletzte.wechsleNachfolger(samuel);
		zwiebel.tueEtwas();
	}
}
