package de.dhbw.tinf18.streams.functional.playground.book.model;

import java.io.Serializable;
import java.util.Objects;

public class Publisher implements Serializable {

	private static final long serialVersionUID = 7197742007500902933L;
	private final String number;

	public Publisher(final String number) {
		super();
		this.number = number;
	}

	public static Publisher from(ISBN isbn) {
		final String extractedNumber = isbn.representation().substring(6, 11);
		return new Publisher(extractedNumber);
	}

	public String number() {
		return number;
	}

	@Override
	public String toString() {
		return number();
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Publisher) {
			Publisher other = (Publisher) obj;
			return Objects.equals(this.number, other.number);
		}
		return false;
	}
}
