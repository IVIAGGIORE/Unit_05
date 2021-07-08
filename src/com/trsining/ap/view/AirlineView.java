package com.trsining.ap.view;

import java.util.List;

import com.trsining.ap.bean.Airline;

public class AirlineView {
	
	private String print(Airline al) {
		return "Airline [destination=" + al.getDestination() + ", flight_number=" + al.getFlight_number() + ", aircraft_type="
				+ al.getAircraft_type() + ", departure_time=" + al.getDeparture_time() + "]\n";
	}
	
	String res = "";	
	public String destination_List(List<Airline> airlines, String destination) {
		res = "";
		airlines.forEach((airline) -> {
			if (airline.getDestination() == destination) res = res + print(airline);
		});
		return res;
	}
	
	public String sundays_List(List<Airline> airlines, int sunday) {
		res = "";
		airlines.forEach((airline) -> {
			for(int i = 0; i < airline.getSundays().length; i++)
				if (airline.getSundays()[i] == sunday)
				{
					res = res + print(airline);
					break;
				}
		});
		return res;
	}
	
	public String sundays_and_departure_time_List(List<Airline> airlines, int sunday, int departure_time) {
		res = "";
		airlines.forEach((airline) -> {
			for(int i = 0; i < airline.getSundays().length; i++)
				if (airline.getSundays()[i] == sunday && airline.getDeparture_time() > departure_time)
				{
					res = res + print(airline);
					break;
				}
		});
		return res;
	}
	
	
}
