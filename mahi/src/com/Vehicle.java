package com;

public class Vehicle {
	
	String make;
	String model;
	double onroadprice;
	int vehicleid;
	
	public Vehicle(String make, String model, double onroadprice, int vehicleid) {
		super();
		this.make = make;
		this.model = model;
		this.onroadprice = onroadprice;
		this.vehicleid = vehicleid;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getOnroadprice() {
		return onroadprice;
	}

	public void setOnroadprice(double onroadprice) {
		this.onroadprice = onroadprice;
	}

	public int getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
}

