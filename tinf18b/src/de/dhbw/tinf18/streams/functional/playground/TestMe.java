package de.dhbw.tinf18.streams.functional.playground;

import java.util.List;
import java.util.Random;

import de.dhbw.tinf18.streams.functional.playground.book.creation.CreatePlayground;
import de.dhbw.tinf18.streams.functional.playground.book.model.Book;

public class TestMe {

	private static final Random random = new Random(132L);
	private static final int amountOfBooks = 2_000_000;

	public static void main(String[] args) throws Exception {
		final List<Book> allBooks = CreatePlayground.withBooks(amountOfBooks, random);
		if (amountOfBooks == allBooks.size()) {
			System.out.println("*** Der Bücher-Spielplatz ist bereit für deine Experimente!");
		}
	}
}
