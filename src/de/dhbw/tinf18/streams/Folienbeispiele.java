package de.dhbw.tinf18.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Folienbeispiele {
	
	public static void main(String[] args) {
		
List<Integer> even = Stream.of(1, 2, 3).filter(n -> (n % 2) == 0).collect(Collectors.toList());
System.out.println(even);

List<String> none = Stream.of(
							  new S��igkeit("Weingummi", 180),
							  new S��igkeit("Lakritzschnecken", 240),
							  new S��igkeit("Gummib�rchen", 40))
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
		
Stream<Charakter> ringTr�ger = 
	Stream.of(frodo, samwell, gandalf, sauron)
          .filter((Charakter figur) -> figur.mitRing());

Stream<Charakter> ringTr�ger2 = 
	Stream.of(frodo, samwell, gandalf, sauron)
		.filter(Charakter::mitRing);

System.out.println(ringTr�ger);
System.out.println(ringTr�ger2);

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

	}
	
	private static class S��igkeit {
		
		private final String name;
		private final int gewicht;

		public S��igkeit(String name, int gewicht) {
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
