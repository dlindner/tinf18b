package de.dhbw.tinf18.pattern.design.fabrik;

public class DeutscheEkligeSpeisenFabrik implements EkligeSpeisenFabrik {

	public static DeutscheEkligeSpeisenFabrik erstelleF�rS�ddeutschland() {
		return new DeutscheEkligeSpeisenFabrik(new K�mmerling());
	}

	public static DeutscheEkligeSpeisenFabrik erstelleF�rNorddeutschland() {
		return new DeutscheEkligeSpeisenFabrik(new KarlsruherLeitungswasser());
	}

	private Getr�nk regional;
	
	private DeutscheEkligeSpeisenFabrik(Getr�nk regional) {
		super();
		this.regional = regional;
	}
	
	@Override
	public Essen erstelleEssen() {
		return new S�lze();
	}
	
	@Override
	public Getr�nk erstelleGetr�nk() {
		return this.regional;
	}
	
	@Override
	public Nachtisch erstelleNachtisch() {
		return new Grie�brei();
	}
	
	@Override
	public S��igkeit erstelleS��igkeit() {
		return new Salmiakpastillen();
	}
	
	private static final class K�mmerling implements Getr�nk {
	}
	
	private static final class KarlsruherLeitungswasser implements Getr�nk {
	}
	
	private static final class Grie�brei implements Nachtisch {
	}
	
	private static final class S�lze implements Essen {
	}
	
	private static final class Salmiakpastillen implements S��igkeit {
	}
}
