package com.qtech.intership.dayone;

public class Student {
private int rollno;
private String name;
private long mobileno;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobileno() {
	return mobileno;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", mobileno=" + mobileno + "]";
}

}