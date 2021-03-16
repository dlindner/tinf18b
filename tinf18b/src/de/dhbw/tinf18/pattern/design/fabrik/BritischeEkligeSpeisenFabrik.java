package de.dhbw.tinf18.pattern.design.fabrik;

public class BritischeEkligeSpeisenFabrik implements EkligeSpeisenFabrik {
	
	public BritischeEkligeSpeisenFabrik() {
		super();
	}
	
	@Override
	public Essen erstelleEssen() {
		return new BlackPudding();
	}
	
	@Override
	public Getr�nk erstelleGetr�nk() {
		return new BloodyMary();
	}
	
	@Override
	public Nachtisch erstelleNachtisch() {
		return new Porridge();
	}
	
	@Override
	public S��igkeit erstelleS��igkeit() {
		return new CheddarCheeseChips();
	}
	
	private static final class Porridge implements Nachtisch {
	}
	
	private static final class BloodyMary implements Getr�nk {
	}
	
	private static final class BlackPudding implements Essen {
	}
	
	private static final class CheddarCheeseChips implements S��igkeit {
	}
}
