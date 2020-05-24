package de.dhbw.tinf18.streams.functional.playground.book.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Random;

import de.dhbw.tinf18.streams.functional.playground.book.creation.ISBNs;

public class ISBN implements Serializable {

	private static final long serialVersionUID = 5681084304860620535L;
	private final String representation;

	public ISBN(String representation) {
		super();
		this.representation = representation;
	}

	public static ISBN createWith(Random random) {
		return new ISBN(new ISBNs(random).createNext());
	}

	public String representation() {
		return representation;
	}

	public String prefix() {
		return representation().substring(0, 3);
	}

	public String groupNumber() {
		return representation().substring(4, 5);
	}

	public String publisherNumber() {
		return representation().substring(6, 11);
	}

	public String titleNumber() {
		return representation().substring(12, 15);
	}

	public String checkDigit() {
		return representation().substring(16, 17);
	}

	@Override
	public String toString() {
		return representation();
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.representation);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof ISBN) {
			final ISBN other = (ISBN) obj;
			return Objects.equals(this.representation, other.representation);
		}
		return false;
	}
}
