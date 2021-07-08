package com.trsining.ap.bean;
import java.util.Random;

public class Airline {

	private String destination;
	private int flight_number;
	private String aircraft_type;
	private int departure_time;
	private int[] sundays;
	
	public Airline() {
		super();
		Random rand = new Random();
		this.setDestination("Minsk");
		this.setFlight_number(rand.nextInt(1000));
		this.setAircraft_type("none");
		this.setDeparture_time(rand.nextInt(24));
		this.setSundays(new int[7]);
		for(int i = 0; i < 7; i++) sundays[i] = rand.nextInt(7);
	}
	
	public Airline(String destination, int flight_number, String aircraft_type, int departure_time, int[] sundays) {
		super();
		this.setDestination(destination);
		this.setFlight_number(flight_number);
		this.setAircraft_type(aircraft_type);
		this.setDeparture_time(departure_time);
		this.setSundays(sundays);
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlight_number() {
		return flight_number;
	}

	public void setFlight_number(int flight_number) {
		this.flight_number = flight_number;
	}

	public String getAircraft_type() {
		return aircraft_type;
	}

	public void setAircraft_type(String aircraft_type) {
		this.aircraft_type = aircraft_type;
	}

	public int getDeparture_time() {
		return departure_time;
	}

	public void setDeparture_time(int departure_time) {
		this.departure_time = departure_time;
	}

	public int[] getSundays() {
		return sundays;
	}

	public void setSundays(int[] sundays) {
		this.sundays = sundays;
	}

	

}
