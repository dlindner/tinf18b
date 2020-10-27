package de.dhbw.tinf18.streams.functional.playground.book.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Random;

import de.dhbw.tinf18.streams.functional.playground.book.creation.AuthorNames;

public class Author implements Serializable {

	private static final long serialVersionUID = -2510434872112920201L;
	
	private final String name;

	public Author(String name) {
		super();
		this.name = name;
	}

	public static Author createWith(Random random) {
		return new Author(
				new AuthorNames(random).createNext());
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public String name() {
		return this.name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Author) {
			Author other = (Author) obj;
			return Objects.equals(this.name, other.name);
		}
		return false;
	}
}
