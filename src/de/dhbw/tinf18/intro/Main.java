package de.dhbw.tinf18.intro;

import java.util.stream.Stream;

public final class Main {
	
	private Main() {
		super();
	}

	public static void main(final String[] arguments) {
		final AlfaView dhbwDienst = new AlfaView();
		dhbwDienst.ver�ffentliche();
		
		final Youtube �ffentlicheDienst = new Youtube();
		�ffentlicheDienst.ver�ffentliche();
		
		Stream.of(
				dhbwDienst,
				�ffentlicheDienst
			)
			.sorted()
			.forEach(Streamingdienst::ver�ffentliche);
	}
}
