package com.qtech.internship.daynine;

import java.util.Scanner;

public class VehicleRentalSystem {
	private static final Bike[] Vehicle = null;

	public static void main(String[]args) throws InvalidRentalException {
		Scanner sc=new Scanner(System.in);
		Vehicle[]vehicles=new Vehicle[2];
		try {
			//Input the car
			
			System.out.println("Enter Vehicle Type(1-Car,2-bike):");
			int type1=sc.nextInt();
			
			System.out.println("Enter Vehicle ID:");
			int id1=sc.nextInt();
			sc.nextLine();//consume newline
			
			System.out.println("Enter Model:");
			String model1=sc.nextLine();
			System.out.println("Enter Base Rate:");
			double rate1=sc.nextDouble();
			if(type1==1) {
				sc.nextLine();//consume newline
				
				System.out.println("Enter Car Type:");
				String carType=sc.nextLine();
				System.out.println("Enter Insurance Fee:");
				double insurance=sc.nextDouble();
				vehicles[0]=new Car(id1,model1,rate1,carType,insurance);
			}
			//input for Bike
			
			System.out.println("\nEnter Vehicle Type(1-car,2-bike):");
			int type2=sc.nextInt();
			
			System.out.println("Enter Vehicle ID:");
			int id2=sc.nextInt();
			sc.nextLine();//consume newline
			
			System.out.println("Enter Model:");
			String model2=sc.nextLine();
			System.out.println("Enter Base Rate:");
			double rate2=sc.nextDouble();
			
			if(type2==2 ) {
				System.out.println("Enter Engine CC:");
				int cc=sc.nextInt();
				System.out.println("Enter Helmet Rental Fee:");
				double helmet=sc.nextDouble();
				Vehicle[1]=new Bike(id2,model2,rate2,cc,helmet);
			}
			System.out.println("\nEnter rental days for all vehicles:");
			int days=sc.nextInt();
			System.out.println("\n---Vehicle Rental Details---");
			for(Vehicle v:vehicles) {
				 v.displayDetails();
				
				System.out.println("Total Rental("+days+"days):"+v.calculateRental(days));
				System.out.println();
			}
		 
			System.out.println("Invalid input type.Please enter correct data.");
		}catch(Exception e) {
			
			System.out.println("InvalidRentalException:"+e.getMessage());
		}
	}
}


