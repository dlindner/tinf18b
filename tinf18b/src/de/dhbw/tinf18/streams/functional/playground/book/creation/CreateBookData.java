package de.dhbw.tinf18.streams.functional.playground.book.creation;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.function.Supplier;

public class CreateBookData {

	public static void main(String[] args) throws IOException {
		final Random random = new Random(132L);
		final int amount = 2_000_000;
		write(
			amount,
			"booktitles",
			new BookTitles(random),
			new File("booktitles.txt"));
		write(
			amount,
			"authors",
			new AuthorNames(random),
			new File("authors.txt"));
		write(
			amount,
			"isbns",
			new ISBNs(random),
			new File("isbns.txt"));
		System.out.println("book data successfully created.");

	}

	private static void write(
			int amount,
			String denotation,
			Supplier<String> source,
			File target) throws IOException {
		try (PrintWriter writer = new PrintWriter(target, "utf-8")) {
			for (int i = 0; i < amount; i++) {
				writer.println(i + "|" + source.get());
			}
		}
		System.out.println(amount + " " + denotation + " written to " + target);
	}
}
