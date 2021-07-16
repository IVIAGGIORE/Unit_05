package com.trsining.ap.bean;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(destination, numberFlight, timeDeparture, typeAircraft, weekDays);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		return Objects.equals(destination, other.destination) && Objects.equals(numberFlight, other.numberFlight)
				&& Objects.equals(timeDeparture, other.timeDeparture)
				&& Objects.equals(typeAircraft, other.typeAircraft) && Objects.equals(weekDays, other.weekDays);
	}
	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", numberFlight=" + numberFlight + ", typeAircraft="
				+ typeAircraft + ", timeDeparture=" + timeDeparture + ", weekDays=" + weekDays + "]";
	}
	
	

	
	
}
