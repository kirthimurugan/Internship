package com.qtech.dayeight;

class InvalidGPAException extends Exception {
	public InvalidGPAException(String message) {
		super(message);
	}

}
//Interface
interface Evaluatable {
	boolean isPassed();
	double getGPA();
	
}
