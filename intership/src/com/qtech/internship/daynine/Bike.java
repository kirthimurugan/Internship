package com.qtech.internship.daynine;

 class Bike extends Vehicle {
	 private int engineCC;
	 private double helmetRentalFee;
	 
	 public Bike(int vehicleId,String model,double baseRate,int engineCC,double helmetRentalFee) {
		 super(vehicleId,model,baseRate);
		 this.engineCC=engineCC;
		 this.helmetRentalFee=helmetRentalFee;
	 }
 
 public double calculateRental(int days)throws InvalidRentalException {
	 if(days<=0)throw new InvalidRentalException("Rental days must be greater than zero.");
 }

 public void displayDetails() {
	 super.displayDetails();
	 System.out.println("EngineCC:"+engineCC);
 }
 }
	 
 
	


