package de.dhbw.tinf18.streams.functional.playground.book;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import de.dhbw.tinf18.streams.functional.playground.book.creation.CreatePlayground;
import de.dhbw.tinf18.streams.functional.playground.book.model.Author;
import de.dhbw.tinf18.streams.functional.playground.book.model.Book;

public class Playground {

	private static final Random random = new Random(132L);
	private static final int amountOfBooks = 2_000_000;

	public static void main(String[] args) throws Exception {
		final List<Book> allBooks = CreatePlayground.withBooks(amountOfBooks, random);

//		System.out.println(allBooks.stream()
//			.map(Book::isbn)
//			.map(ISBN::checkDigit)
//			.mapToInt(Integer::valueOf)
//			.average());

		final Map<String, List<Book>> duplicateTitles = allBooks.stream()
			.collect(Collectors.groupingBy(Book::title));
		printDuplicates(list -> list.get(0).title()).accept(
				duplicateTitles.values());

		final Map<Author, List<Book>> duplicateAuthors = allBooks.stream()
				.collect(Collectors.groupingBy(Book::author));
		printDuplicates(list -> list.get(0).author().name()).accept(
				duplicateAuthors.values());
	}

	private static Consumer<Collection<List<Book>>> printDuplicates(
			Function<List<Book>, String> extract) {
		return values -> {
			final Map<String, Integer> duplicateTitleCounts =
					values.stream()
					.filter(list -> list.size() > 1)
					.collect(Collectors.toMap(
						extract,
						List::size));

			duplicateTitleCounts.entrySet().forEach(
						entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
		};
	}
}
