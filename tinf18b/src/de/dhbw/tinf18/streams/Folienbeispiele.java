package de.dhbw.tinf18.streams;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import de.dhbw.tinf18.streams.functional.playground.book.creation.BookShelf;

public class Folienbeispiele {
	
	public static void main(String[] args) {
		
List<Integer> even = Stream.of(1, 2, 3).filter(n -> (n % 2) == 0).collect(Collectors.toList());
System.out.println(even);

List<String> none = Stream.of(
							  new Süßigkeit("Weingummi", 180),
							  new Süßigkeit("Lakritzschnecken", 240),
							  new Süßigkeit("Gummibärchen", 40))
		                   .filter(s -> s.gewicht() > 100)
		                   .map(s -> s.name())
		                   .sorted()
		                   .collect(Collectors.toList());
System.out.println(none);

Stream.empty();
Stream.of("one", "two", "three");
List.of("one", "two", "three").stream();

Stream.Builder<String> builder = Stream.builder(); 
builder.add("a")
	   .add("b") 
       .add("c") 
       .build(); 

Stream.generate(Math::random);
		
Stream<Charakter> ringTräger = 
	Stream.of(frodo, samwell, gandalf, sauron)
          .filter((Charakter figur) -> figur.mitRing());

Stream<Charakter> ringTräger2 = 
	Stream.of(frodo, samwell, gandalf, sauron)
		.filter(Charakter::mitRing);

System.out.println(ringTräger);
System.out.println(ringTräger2);

Stream<Normalo> niemande = Stream.of(
	clarkKent, bruceWayne, peterParker);
Stream<Superheld> helden =
	niemande.map((Normalo nobody) -> new Superheld());
		
Stream<Superheld> helden2 =
	Stream.of(clarkKent, bruceWayne, peterParker)
    	.map(nobody -> new Superheld());

System.out.println(helden);
System.out.println(helden2);

Stream.generate(() -> Math.random())
      .limit(1000)
      .forEach(zahl -> System.out.println(zahl));

Stream.generate(Math::random)
	.limit(1000)
	.forEach(System.out::println);

List<Long> ergebnis = 
	Stream.generate(Math::random)
	    .map(number -> number * 100.0D)
	    .map(Math::round)
	    .filter(number -> number % 2 == 0)
		.limit(10)
		.collect(Collectors.toList());
System.out.println(ergebnis);

Optional<Integer> summe = 
	Stream.iterate(1, zähler -> zähler + 1)
		.limit(100)
		.reduce((zahl1, zahl2) -> zahl1 + zahl2);
System.out.println(summe);

BookShelf.asStream(new Random())
	.filter(book -> book.publicationDate().isBefore(LocalDate.of(1989, 11, 9)))
	.map(book -> book.title())
	.limit(10)
	.reduce("", (title1, title2) -> (title1.isEmpty()) ? title2 : title1 + ", " + title2);

BookShelf.asStream(new Random())
	.filter(book -> book.publicationDate().isBefore(LocalDate.of(1989, 11, 9)))
	.map(book -> book.title())
	.limit(10)
	.collect(Collectors.joining(", "));

	}
	
	private static class Süßigkeit {
		
		private final String name;
		private final int gewicht;

		public Süßigkeit(String name, int gewicht) {
			super();
			this.name = name;
			this.gewicht = gewicht;
		}
		
		public int gewicht() {
			return gewicht;
		}
		
		public String name() {
			return name;
		}
	}
	
	private static interface Charakter {
		
		boolean mitRing();
	}
	
	private static interface Normalo {
		
	}
	
	private static class Superheld {
		
	}
	
	private static Charakter frodo = () -> true;
	private static Charakter samwell = () -> false;
	private static Charakter gandalf = () -> false;
	private static Charakter sauron = () -> true;
	
	private static Normalo clarkKent = null;
	private static Normalo bruceWayne = null;
	private static Normalo peterParker = null;
}
