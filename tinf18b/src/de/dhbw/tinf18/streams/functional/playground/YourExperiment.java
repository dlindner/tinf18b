package de.dhbw.tinf18.streams.functional.playground;

import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import de.dhbw.tinf18.streams.functional.playground.book.creation.CreatePlayground;
import de.dhbw.tinf18.streams.functional.playground.book.model.Book;
import de.dhbw.tinf18.streams.functional.playground.book.model.Chapter;

public class YourExperiment {

	private static final Random random = new Random(132L);
	private static final int amountOfBooks = 2_000_000;

	public static void main(String[] args) throws Exception {
		final Stream<Book> allBooks = CreatePlayground.withBooks(amountOfBooks, random).stream();
		
		long start = System.nanoTime();
		System.out.println("--> " + allBooks
				.map(book -> book.content())
				.mapToInt(listOfChapters -> listOfChapters.stream().mapToInt(Chapter::pages).sum())
				.average());
		System.out.println((System.nanoTime() - start) / 1E6);
	}
}
