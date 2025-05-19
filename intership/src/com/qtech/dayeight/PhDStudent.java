package com.qtech.dayeight;

class PhDStudent extends Student {
	public PhDStudent(String studentId,String name,String department,double gpa)throws InvalidGPAException {
		super(studentId,name,department,gpa);
	}
	public void calculateGrade( ) {
		//GPA already represents grade for simplicity
	}
	public boolean isPassed() {
		return getGPA()>=3.0;
		
		
	}
	public void displayDetails() {
		System.out.println("Student:"+getName()+"|Type:PhD|GPA:"+getGPA()+"|Status:"+(isPassed()?"Passed":"Failed"));
	}

				
						
						
		
	}
	


