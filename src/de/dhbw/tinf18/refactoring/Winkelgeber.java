package de.dhbw.tinf18.refactoring;

import java.util.Optional;

public class Winkelgeber {

	private final Winkelsensor sensor;
	
	public Winkelgeber(Winkelsensor sensor) {
		super();
		this.sensor = sensor;
	}
	
	public int gibWinkel_ErrorCode() {
		if (sensor.funktioniert()) {
			return sensor.winkel();
		}
		return -1;
	}

	public Integer gibWinkel_NullValue() {
		if (sensor.funktioniert()) {
			return sensor.winkel();
		}
		// Bug!
		return null;
	}

	public int gibWinkel_CheckedException() throws SensorException {
		if (sensor.funktioniert()) {
			return sensor.winkel();
		}
		throw new SensorException();
	}
	
	public int gibWinkel_UncheckedException() {
		if (sensor.funktioniert()) {
			return sensor.winkel();
		}
		throw new RuntimeException();
	}
	
	// Railway-Oriented Programming
	public Optional<Integer> gibWinkel_Optional() {
		if (sensor.funktioniert()) {
			return Optional.of(sensor.winkel());
		}
		return Optional.empty();
	}
	
	public Optional<Integer> gibWinkel_OptionalAndException() throws SensorException {
		if (sensor.funktioniert()) {
			return Optional.ofNullable(sensor.winkel());
		}
		throw new SensorException();
	}
}
