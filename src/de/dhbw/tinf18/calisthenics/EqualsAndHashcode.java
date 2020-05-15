package de.dhbw.tinf18.calisthenics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EqualsAndHashcode {
	
	public static void main(String[] args) {
		Set<Obst> fruchtsalat = new HashSet<>();
		fruchtsalat.add(new Obst("Erdbeere", 59));
		fruchtsalat.add(new Obst("Birne", 84));
		fruchtsalat.add(new Obst("Pfirsich", 30));
		fruchtsalat.add(new Obst("Melone", 10));
		fruchtsalat.add(new Obst("Erdbeere", 19));
		
		System.out.println(fruchtsalat.size());
		
		Map<Obst, Integer> brennwert = new HashMap<EqualsAndHashcode.Obst, Integer>();
		Obst nüsse = new Obst("Erdbeeren", 59);
		brennwert.put(nüsse, 84);
		nüsse.changeName("Tiefkühlerdbeeren");
		//brennwert.put(nüsse, 55);
		System.out.println("--> " + brennwert.get(nüsse));
		
		System.out.println(brennwert.size());

		Integer integer = brennwert.get(new Obst("Erdbeeren", 0));
		System.out.println("Brennwert: " + integer);
	}
	
	/**
	 * Dieses Obst ist unvergleichlich!
	 */
	private static class Obst {
		
		private String name;
		private final int vitaminC;

		public Obst(String name, int vitaminC) {
			super();
			this.name = name;
			this.vitaminC = vitaminC;
		}
		
		public void changeName(String newName) {
			this.name = newName;
		}

		// Nur generieren lassen!
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		// Nur generieren lassen!
		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			Obst other = (Obst) obj;
			if (name == null) {
				if (other.name != null) {
					return false;
				}
			} else if (!name.equals(other.name)) {
				return false;
			}
			return true;
		}
	}
}
