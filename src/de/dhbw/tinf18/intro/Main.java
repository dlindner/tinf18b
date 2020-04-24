package de.dhbw.tinf18.intro;

import java.util.Arrays;
import java.util.List;

public final class Main {
	
	private Main() {
		super();
	}

	public static void main(final String[] arguments) {
		final AlfaView dhbwDienst = new AlfaView();
		dhbwDienst.ver�ffentliche();
		
		final Youtube �ffentlicherDienst = new Youtube();
		�ffentlicherDienst.ver�ffentliche();
		
		final List<Streamingdienst> dienste = Arrays.asList(
			dhbwDienst,
			�ffentlicherDienst
		);
		dienste.forEach(Streamingdienst::ver�ffentliche);
		
		final Rechenzentrum serverraum = new Rechenzentrum();
		serverraum.lassLaufen(dhbwDienst);
		serverraum.lassLaufen(�ffentlicherDienst);
		
		dienste.forEach(serverraum::lassLaufen);
	}
}
