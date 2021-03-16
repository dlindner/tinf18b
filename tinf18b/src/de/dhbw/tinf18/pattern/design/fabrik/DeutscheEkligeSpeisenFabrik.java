package de.dhbw.tinf18.pattern.design.fabrik;

public class DeutscheEkligeSpeisenFabrik implements EkligeSpeisenFabrik {

	public static DeutscheEkligeSpeisenFabrik erstelleFürSüddeutschland() {
		return new DeutscheEkligeSpeisenFabrik(new Kümmerling());
	}

	public static DeutscheEkligeSpeisenFabrik erstelleFürNorddeutschland() {
		return new DeutscheEkligeSpeisenFabrik(new KarlsruherLeitungswasser());
	}

	private Getränk regional;
	
	private DeutscheEkligeSpeisenFabrik(Getränk regional) {
		super();
		this.regional = regional;
	}
	
	@Override
	public Essen erstelleEssen() {
		return new Sülze();
	}
	
	@Override
	public Getränk erstelleGetränk() {
		return this.regional;
	}
	
	@Override
	public Nachtisch erstelleNachtisch() {
		return new Grießbrei();
	}
	
	@Override
	public Süßigkeit erstelleSüßigkeit() {
		return new Salmiakpastillen();
	}
	
	private static final class Kümmerling implements Getränk {
	}
	
	private static final class KarlsruherLeitungswasser implements Getränk {
	}
	
	private static final class Grießbrei implements Nachtisch {
	}
	
	private static final class Sülze implements Essen {
	}
	
	private static final class Salmiakpastillen implements Süßigkeit {
	}
}
