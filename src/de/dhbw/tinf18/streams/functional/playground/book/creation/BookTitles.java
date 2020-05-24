package de.dhbw.tinf18.streams.functional.playground.book.creation;

import java.util.Random;
import java.util.function.Supplier;

public class BookTitles implements Supplier<String> {

	private Random random;

	public BookTitles(Random random) {
		super();
		this.random = random;
	}

	@Override
	public String get() {
		return createNext();
	}

	public String createNext() {
		final StringBuilder result = new StringBuilder();
		result.append(randomOf(prefix));
		result.append(" ");
		if (random.nextBoolean()) {
			result.append(randomOf(descriptive));
			result.append(" ");
			if (random.nextBoolean()) {
				result.append("and ");
				result.append(randomOf(descriptive));
				result.append(" ");
			}
		}
		result.append(randomOf(first));
		result.append(" ");
		final String mainTitle = randomOf(second);
		result.append(mainTitle);
		if (random.nextBoolean()) {
			final String secondaryTitle = randomOf(second);
			if (!(mainTitle.equals(secondaryTitle))) {
				result.append(" and ");
				result.append(secondaryTitle);
			}
		}
		return result.toString();
	}

	private String randomOf(String[] strings) {
		final int index = random.nextInt(strings.length);
		return strings[index];
	}

	private String[] prefix = {
			"A",
			"The",
			"Some",
	};

	private String[] descriptive = {
			"small",
			"little",
			"short",
			"funny",
			"great",
			"prolonged",
			"elaborate",
			"sad",
			"interesting",
			"boring",
	};

	private String[] first = {
			"history of",
			"story of",
			"book of",
			"novel of",
			"essay on",
	};

	private String[] second = {
			"time",
			"ancient wisdom",
			"wisdom",
			"chemistry",
			"physics",
			"astronomy",
			"astrology",
			"psychology",
			"informatics",
			"mathematics",
			"art",
			"religion",
			"food",
			"politics",
			"warfare",
			"strategy",
			"chess",
			"motorcycles",
			"archery",
			"insects",
			"birds",
			"cooking",
			"wine",
			"whiskey",
			"beer",
			"pasta",
			"engineering",
			"dwarves",
			"fortresses",
			"kings",
			"crowns",
			"spies",
			"flight",
			"airplanes",
	};
}
