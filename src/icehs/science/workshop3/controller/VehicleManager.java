package icehs.science.workshop3.controller;

import icehs.science.workshop3.entity.*;

public class VehicleManager {
	
	Vehicle []vehicles = {
			new Airplane("보잉747", 1300, 300, 4),
			new Airplane("F-15", 1600, 1, 10),
			new Car("그렌져", 180, 5, 5),
			new Car("스파크", 130, 4, 15),
			new Car("스타랙스", 150, 10, 11),
			new Ship("크루즈", 30, 400, 35000),
			new Ship("노틸러스", 25, 150, 15000)
			
	};
	
	/*Airplane[] airplaneArr;
	Car[] carArr;
	Ship[] shipArr;*/
	
	public VehicleManager() {
		
	
	}
	
	public void displayVehicles(String title) {
		System.out.println(title);
		
		for (int inx = 0 ; inx < vehicles.length ; inx++) {
			vehicles[inx].displayInfo();
			vehicles[inx].setAvailable(true);
		}
		
		
		System.out.println();
	}
}

