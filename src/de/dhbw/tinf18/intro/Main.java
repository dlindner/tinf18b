package de.dhbw.tinf18.intro;

import java.util.stream.Stream;

public final class Main {
	
	private Main() {
		super();
	}

	public static void main(final String[] arguments) {
		final AlfaView dhbwDienst = new AlfaView();
		dhbwDienst.veröffentliche();
		
		final Youtube öffentlicheDienst = new Youtube();
		öffentlicheDienst.veröffentliche();
		
		Stream.of(
				dhbwDienst,
				öffentlicheDienst
			)
			.sorted()
			.forEach(Streamingdienst::veröffentliche);
	}
}
