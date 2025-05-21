package com.qtech.internship.daynine;

public class Car extends Vehicle {
	private String carType;
	private double insuranceFee;
	
	public Car(int VehicleId,String model,double baseRate,String carType,double insuranceFee) {
		super(VehicleId,model,baseRate);
		this.carType=carType;
		this.insuranceFee=insuranceFee;
		
	}
	
	public double calculateRental(int days)throws InvalidRentalException {
		if(days<=0)throw new InvalidRentalException("Rental days must be greater than zero.");
		return getBaseRate()*days+insuranceFee;
	}

    
    public void displayDetails();
    {
    	super.displayDetails();
    	System.out.println("Car Type:"+carType);
    }
    }
		
	



