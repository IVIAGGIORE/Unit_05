package com.trsining.ap.bean;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.List;

public class Airline {
	private String destination;
	private String numberFlight; 
	private String typeAircraft; 
	private Time timeDeparture;
	private List<String> weekDays; 
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setNumberFlight(String numberFlight) {
		this.numberFlight = numberFlight;
	}
	public void setTypeAircraft(String typeAircraft) {
		this.typeAircraft = typeAircraft;
	}
	public void setTimeDeparture(Time timeDeparture) {
		
		this.timeDeparture = timeDeparture;
	}
	public void setWeekDays(List<String> weekDays) {
		this.weekDays = weekDays;
	}
	
	public String getDestination() {
		return this.destination;
	}
	public String getNumberFlight() {
		return this.numberFlight;
	}
	public String getTypeAircraft() {
		return this.typeAircraft;
	}
	public Time getTimeDeparture() {
		return this.timeDeparture;
	}
	public List<String> getWeekDays() {
		return this.weekDays;
	}
	
	
	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", numberFlight=" + numberFlight + ", typeAircraft="
				+ typeAircraft + ", timeDeparture=" + timeDeparture + ", weekDays=" + weekDays + "]";
	}
	
	

	
	
}
