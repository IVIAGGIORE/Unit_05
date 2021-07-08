package com.trsining.ap.main;

import java.util.ArrayList;
import java.util.List;

import com.trsining.ap.bean.Airline;
import com.trsining.ap.logic.AirlineLogic;
import com.trsining.ap.view.AirlineView;

public class Main {
	public static void main(String[] args) {
		
		List<Airline> airlines;		
		airlines = new ArrayList<Airline>();
		
		for(int i = 0; i < 10; i++)
		{
			airlines.add(new Airline());
		}

		AirlineView view = new AirlineView();

		System.out.println(view.destination_List(airlines, "Minsk"));
		System.out.println("-----------------------------");
		System.out.println(view.sundays_List(airlines, 2));
		System.out.println("-----------------------------");
		System.out.println(view.sundays_and_departure_time_List(airlines, 3, 10));


	}
}
