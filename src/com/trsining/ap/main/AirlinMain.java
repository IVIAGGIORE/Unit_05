package com.trsining.ap.main;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import  java.text.ParseException;
import com.trsining.ap.bean.Airline;
import com.trsining.ap.logic.AirlineLogic;
import com.trsining.ap.view.AirlinView;

import javax.xml.crypto.Data;

public class AirlinMain {
	

	public static void main(String[] args) throws ParseException {
		
		AirlineLogic f1 = new AirlineLogic();
		f1.addFromFile("input.txt");
		
		AirlinView view = new AirlinView();
		System.out.printf(view.print(f1));
		
		String rezA = f1.rezA("Piter");
		System.out.println("__________rezA ___________");
		System.out.printf(rezA);
		rezA = f1.rezA("Minsk");
		System.out.println("__________rezA ___________");
		System.out.printf(rezA);
		
		String rezB = f1.rezB("Monday");
		System.out.println("__________rezB ___________");
		System.out.printf(rezB);
				
		String rezC = f1.rezC("Monday", "15:10:00");
		System.out.println("__________rezC ___________");
		System.out.printf(rezC);
}
}
