package de.dhbw.tinf18.calisthenics;

import java.util.Arrays;
import java.util.List;

public class TellDontAsk {
	
	public static void main(String[] args) {
		List<Student> students = loadStudents();
		Printer printer = acquirePrinter();
		for (final Student each : students) {
			each.printNameTagOn(printer);
		}
	}
	
	private static Printer acquirePrinter() {
		return System.out::println;
	}

	private static List<Student> loadStudents() {
		List<Student> result = Arrays.asList(
				new Student("Anton", 007),
				new Student("Berta", 42),
				new $1337$("Cäsar", 4711));
		return result;
	}
	
	private static class Student {

		private final String name;
		private final int matrikelNummer;

		public Student(String name, int matrikelNummer) {
			super();
			this.name = name;
			this.matrikelNummer = matrikelNummer;
		}

		public void printNameTagOn(Printer printer) {
			printer.print(this.name + ": " + this.matrikelNummer);
		}
	}
	
	private static class $1337$ extends Student {

		public $1337$(String name, int matrikelNummer) {
			super(name, matrikelNummer);
		}
		
		@Override
		public void printNameTagOn(Printer printer) {
			printer.print("$$$$$ SUPER-Hax0r $$$$$");
		}
	}
	
	private static interface Printer {
		
		void print(String line);
	}
}
