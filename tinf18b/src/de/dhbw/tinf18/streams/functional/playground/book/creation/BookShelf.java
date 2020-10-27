package de.dhbw.tinf18.streams.functional.playground.book.creation;

import java.util.Random;
import java.util.stream.Stream;

import de.dhbw.tinf18.streams.functional.playground.book.model.Book;

public class BookShelf {

	public static Stream<Book> asStream(
			final Random random) {
		return Stream.generate(() -> Book.createWith(random));
	}
}
