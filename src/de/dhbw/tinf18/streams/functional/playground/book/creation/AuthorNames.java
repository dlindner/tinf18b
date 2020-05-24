package de.dhbw.tinf18.streams.functional.playground.book.creation;

import java.util.Random;
import java.util.function.Supplier;

public class AuthorNames implements Supplier<String> {

	private Random random;

	public AuthorNames(Random random) {
		super();
		this.random = random;
	}

	@Override
	public String get() {
		return createNext();
	}

	public String createNext() {
		final StringBuilder result = new StringBuilder();
		final boolean gender = random.nextBoolean();
		String[] firstNames = gender ? firstMale : firstFemale;
		final String firstName = randomOf(firstNames);
		result.append(firstName);
		result.append(" ");
		if (random.nextBoolean() && random.nextBoolean()) {
			if (random.nextBoolean()) {
				final String secondFirstName = randomOf(firstNames);
				if (!firstName.equals(secondFirstName)) {
					result.append(secondFirstName);
					result.append(" ");
				}
			} else {
				final char middleInitial = (char) (random.nextInt(24) + 65);
				result.append(Character.toUpperCase(middleInitial) + ".");
				result.append(" ");
			}
		}
		final String lastName = randomOf(last);
		result.append(lastName);
		return result.toString();
	}

	private String randomOf(String[] strings) {
		final int index = random.nextInt(strings.length);
		return strings[index];
	}

	private String[] firstMale = {
			"Andrew",
			"Bert",
			"Christian",
			"Dilbert",
			"Ernest",
			"Francis",
			"Gilbert",
			"Hick",
			"Ingo",
			"Kyle",
			"Larry",
			"Mike",
			"Norbert",
			"Otis",
			"Phil",
			"Quentin",
			"Robert",
			"Stan",
			"Trevor",
			"Umberto",
			"Victor",
			"Wilbur",
	};

	private String[] firstFemale = {
			"Andrea",
			"Britta",
			"Carol",
			"Dora",
			"Eva",
			"Freia",
			"Greta",
			"Haylee",
			"Irene",
			"Kate",
			"Laurena",
			"Mylene",
			"Nadine",
			"Olivia",
			"Patricia",
			"Rheese",
			"Sienna",
			"Toni",
			"Ulani",
			"Victoria",
			"Wilma",
	};

	private String[] last = {
			"Broomby",
			"Adams",
			"Avey",
			"Klay",
			"Greene",
			"Cline",
			"Bradbury",
			"Heinlein",
			"Wharton",
			"Hobhouse",
			"Vonnegut",
			"Herbert",
			"Flynn",
			"Sowa",
			"Hawking",
			"Martin",
			"Silverberg",
			"Shackley",
			"Dallaire",
			"Watterson",
			"Larson",
			"Smith",
			"Feynman",
			"Henney",
			"Card",
			"Weir",
	};
}
