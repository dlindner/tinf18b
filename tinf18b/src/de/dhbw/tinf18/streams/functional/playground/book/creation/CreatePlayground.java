package de.dhbw.tinf18.streams.functional.playground.book.creation;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import de.dhbw.tinf18.streams.functional.playground.book.model.Book;

public final class CreatePlayground {

	private CreatePlayground() {
		super();
	}

	public static List<Book> withBooks(
			final int amountOfBooks,
			final Random random) {
		final long start = System.nanoTime();
//		final File allData = new File("bookdata.bin");
//		if (allData.isFile() && allData.canRead()) {
//			System.out.println("book data present, loading from disk");
//			try (final FileInputStream fromFile = new FileInputStream(allData);
//			     final BufferedInputStream buffered = new BufferedInputStream(fromFile);
//			     final ObjectInputStream asObjects = new ObjectInputStream(buffered)) {
//				@SuppressWarnings("unchecked")
//				final List<Book> result = (List<Book>) asObjects.readObject();
//				System.out.println(result.size() + " books loaded in " + (System.nanoTime() - start));
//				return result;
//			}
//		}
		System.out.println("no book data found, creating new books (might take a while).");
		final List<Book> allBooks = BookShelf.asStream(random)
				.limit(amountOfBooks)
				.collect(Collectors.toList());
		System.out.println(allBooks.size() + " books created in " + ((System.nanoTime() - start) / 1_000_000) + " ms.");

//		try (final FileOutputStream toFile = new FileOutputStream(allData);
//			 final BufferedOutputStream buffered = new BufferedOutputStream(toFile);
//		     final ObjectOutputStream asObjects = new ObjectOutputStream(buffered)) {
//			asObjects.writeObject(allBooks);
//		}
//		System.out.println(allBooks.size() + " books written");
		return allBooks;
	}
	
}
