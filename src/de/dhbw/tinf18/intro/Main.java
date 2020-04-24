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
		
		final Youtube �ffentlicheDienst = new Youtube();
		�ffentlicheDienst.ver�ffentliche();
		
		final List<Streamingdienst> dienste = Arrays.asList(
			dhbwDienst,
			�ffentlicheDienst
		);
		for (final Streamingdienst each : dienste) {
			each.ver�ffentliche();
		}
	}
}
