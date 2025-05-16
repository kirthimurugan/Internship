package com.qtech.intership.dayone;
public class InterfaceClass implements InterfaceOne,InterfaceTwo { 
	public void display() {
		System.out.println("Display method");
	}
	
	public void print() {
		System.out.println("Print method");
	}
	
	public static void main(String[]args) {
		
		InterfaceClass i = new InterfaceClass();
		i.display();
		i.print();
	}
}
	
	
	
	
	
 
	

}
