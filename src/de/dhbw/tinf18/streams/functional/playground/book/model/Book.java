package de.dhbw.tinf18.streams.functional.playground.book.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import de.dhbw.tinf18.streams.functional.playground.book.creation.BookTitles;

public class Book implements Serializable {

	private static final long serialVersionUID = 8653655840507968813L;
	
	private final Author author;
	private final String title;
	private final ISBN isbn;
	private final LocalDate publicationDate;
	private final List<Chapter> content;

	public Book(
			Author author,
			String title,
			ISBN isbn,
			LocalDate publicationDate,
			List<Chapter> content) {
		super();
		this.author = author;
		this.title = title;
		this.isbn = isbn;
		this.publicationDate = publicationDate;
		this.content = content;
	}

	public static Book createWith(Random random) {
		return new Book(
				Author.createWith(random),
				new BookTitles(random).createNext(),
				ISBN.createWith(random),
				publicationDateWith(random),
				chaptersWith(random));
	}

	public Author author() {
		return author;
	}

	public List<Chapter> content() {
		return content;
	}
	
	public ISBN isbn() {
		return isbn;
	}

	public LocalDate publicationDate() {
		return publicationDate;
	}

	public String title() {
		return title;
	}

	private static LocalDate publicationDateWith(Random random) {
		final int daysSinceEpoch = random.nextInt(47 * 365);
		final int direction = random.nextBoolean() ? 1 : -1;
		return LocalDate.ofEpochDay(daysSinceEpoch * direction);
	}

	private static List<Chapter> chaptersWith(Random random) {
		final int amount = random.nextInt(17) + 1;
		final int wordsPerPage = Chapter.wordsPerPageWith(random);
		return Stream
			.generate(() -> Chapter.createWith(random, wordsPerPage))
			.limit(amount)
			.collect(Collectors.toList());
	}
}
