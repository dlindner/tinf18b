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
		
		final Youtube öffentlicheDienst = new Youtube();
		öffentlicheDienst.veröffentliche();
		
		final List<Streamingdienst> dienste = Arrays.asList(
			dhbwDienst,
			öffentlicheDienst
		);
		for (final Streamingdienst each : dienste) {
			each.veröffentliche();
		}
	}
}
