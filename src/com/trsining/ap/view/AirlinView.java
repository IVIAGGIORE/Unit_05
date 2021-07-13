package com.trsining.ap.view;

import java.util.ArrayList;
import java.util.List;

import com.trsining.ap.bean.Airline;
import com.trsining.ap.logic.AirlineLogic;

public class AirlinView {
	
	public String print(AirlineLogic f1) {
	List<Airline> airlines =  f1.getAirlineLogic();
	String listString = "";

	for(Airline s : airlines) {
		listString = listString + s.toString() + "\n";
		}	  	
	return listString;
	}	
}
