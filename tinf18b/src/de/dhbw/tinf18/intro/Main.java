package de.dhbw.tinf18.intro;

import java.util.Arrays;
import java.util.List;

public final class Main {
	
	private Main() {
		super();
	}

	public static void main(final String[] arguments) {
		final AlfaView dhbwDienst = new AlfaView();
		dhbwDienst.veröffentliche();
		
		final Youtube öffentlicherDienst = new Youtube();
		öffentlicherDienst.veröffentliche();
		
		final List<Streamingdienst> dienste = Arrays.asList(
			dhbwDienst,
			öffentlicherDienst
		);
		dienste.forEach(Streamingdienst::veröffentliche);
		
		final Rechenzentrum serverraum = new Rechenzentrum();
		serverraum.lassLaufen(dhbwDienst);
		serverraum.lassLaufen(öffentlicherDienst);
		
		dienste.forEach(serverraum::lassLaufen);
	}
}
