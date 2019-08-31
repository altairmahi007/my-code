package com;

public class VehicleDemo {
	
	public static Vehicle getVehicleByID(Vehicle[] a, int b) {
		Vehicle d=new Vehicle( "a" , "a" , 0.0 ,0);
		for(Vehicle c:a)
		{if(c.vehicleid==b)
		{d=c;
		break;}
		else
		d=null;}
		return d;
		
	}
	
}
