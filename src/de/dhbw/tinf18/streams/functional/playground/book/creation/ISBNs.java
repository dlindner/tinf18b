package de.dhbw.tinf18.streams.functional.playground.book.creation;

import java.util.Random;
import java.util.function.Supplier;

public class ISBNs implements Supplier<String> {

	private Random random;

	public ISBNs(Random random) {
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
		result.append("-");
		result.append(random.nextInt(10));
		result.append("-");
		result.append(random.nextInt(10));
		result.append(random.nextInt(10));
		result.append(random.nextInt(10));
		result.append(random.nextInt(10));
		result.append(random.nextInt(10));
		result.append("-");
		result.append(random.nextInt(10));
		result.append(random.nextInt(10));
		result.append(random.nextInt(10));
		result.append("-");
		result.append(checksumOf(result.toString()));
		return result.toString();
	}

	private String checksumOf(String isbn) {
		final int[] factors = {1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3};
		int index = 0;
		int sum = 0;
		for (char each : isbn.toCharArray()) {
			if (!Character.isDigit(each)) {
				continue;
			}
			sum += (Integer.valueOf(each) * factors[index]);
			index++;
		}
		return String.valueOf(sum % 10);
	}

	private String randomOf(String[] strings) {
		final int index = random.nextInt(strings.length);
		return strings[index];
	}

	private String[] prefix = {
			"978",
			"979",
	};
}
