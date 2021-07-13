package com.trsining.ap.logic;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.trsining.ap.bean.Airline;

public class AirlineLogic {
	
	private List<Airline> airlines = new ArrayList<Airline>();
	
	public AirlineLogic() {

	}
	
	public List<Airline> getAirlineLogic() {
		return this.airlines;
	}
	
	public void addFromFile(String file) {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get(file), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		for (int i = 0; i < lines.size(); i++) {
			
			Airline air = new Airline();
			
	        String[] arrOfStr = lines.get(i).split(";");
	        air.setDestination(arrOfStr[0]);
	        air.setNumberFlight(arrOfStr[1]);
	        air.setTypeAircraft(arrOfStr[2]);
	       	
	       	Time  time  = null;       	
	       	time  =  Time.valueOf(arrOfStr[3]); 
	       	air.setTimeDeparture(time);
	        
	       	List<String> week = new ArrayList<String>();
	       
				for (int j = 4; j < arrOfStr.length; j++) {
					week.add(arrOfStr[j]);	
				}
				air.setWeekDays(week);
	       	addAirline(air);	       	
	        }

	}
	
	public void addAirline(Airline air) {
		airlines.add(air);
	}

	public List<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}
	
	
	public String rezA(String destination) {
		
		String s = "";
		for (int i = 0; i < airlines.size(); i++) {

			if (airlines.get(i).getDestination().equals(destination)) {			
				s = s + airlines.get(i).toString() + "\n";
				
			}
		}
		if (s == "") {
			return "No elements" + "\n";
		}
		
		return s;
	}
	
	public String rezB(String _weekDays) {
		String s = "";
		for (int i = 0; i < airlines.size(); i++) {
			List<String> weekDays =  airlines.get(i).getWeekDays();
			
			for (int j = 0; j < weekDays.size(); j++) {
			if (weekDays.get(j).equals(_weekDays)) {			
				s = s + airlines.get(i).toString() + "\n";
				break;
				}
			}
		}
				
		if (s == "") {
			return "No elements" + "\n";
		}
	
	return s;
	
	}
	
	public String rezC(String _weekDays, String timeDeparture) {
		String s = "";
		Time  time  = Time.valueOf(timeDeparture); 
		
		for (int i = 0; i < airlines.size(); i++) {
			List<String> weekDays =  airlines.get(i).getWeekDays();
			
			for (int j = 0; j < weekDays.size(); j++) {
			if (weekDays.get(j).equals(_weekDays)) {			
				if(airlines.get(i).getTimeDeparture().after(time)) {
					s = s + airlines.get(i).toString() + "\n";
				}
				break;
				}
			}
		}
		
		if (s == "") {
			return "No elements" + "\n";
		}
	
	return s;
	}
	
}
