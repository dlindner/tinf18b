package de.dhbw.tinf18.clean.architecture.kern.domain;

public class Konto {

	private int stand;
	private RenderInterface renderer;
	
	public Konto(RenderInterface renderer) {
		super();
		this.renderer = renderer;
		this.stand = 0;
	}
	
	public void buchen(int betrag) {
		this.stand = this.stand + betrag;
	}

	@Override
	public String toString() {
		return this.renderer.alsText(stand());
	}
	
	public int stand() {
		return this.stand;
	}
}
