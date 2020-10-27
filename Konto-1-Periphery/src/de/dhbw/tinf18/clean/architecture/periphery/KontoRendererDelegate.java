package de.dhbw.tinf18.clean.architecture.periphery;

import de.dhbw.tinf18.clean.architecture.kern.domain.Konto;
import de.dhbw.tinf18.clean.architecture.kern.domain.RenderInterface;

public class KontoRendererDelegate implements RenderInterface {
	
	private KontoRenderer renderer;

	public KontoRendererDelegate(KontoRenderer renderer) {
		super();
		this.renderer = renderer;
	}
	
	@Override
	public String alsText(int zahl) {
		return this.renderer.rendere(new Konto(this) {
			@Override
			public int stand() {
				return zahl;
			}
		});
	}
}
