package de.dhbw.tinf18.streams.functional.playground.book.model;

import java.io.Serializable;
import java.util.Random;

public class Chapter implements Serializable {

	private static final long serialVersionUID = 1068646614125850906L;
	private final int pages;
	private final int words;

	public Chapter(int pages, int words) {
		super();
		this.pages = pages;
		this.words = words;
	}

	public int pages() {
		return pages;
	}

	public int words() {
		return this.words;
	}

	public static Chapter createWith(Random random, int wordsPerPage) {
		final int pages = random.nextInt(50) + 2;
		final int words = pages * wordsPerPage;
		return new Chapter(pages, words);
	}

	public static int wordsPerPageWith(Random random) {
		return random.nextInt(50) + 250;
	}
}
