package com.qtech.intership.dayone;

public class College extends Student {
private String CollegeName;
@Override
public String toString() {
	return "College [CollegeName=" + CollegeName + ", CollegeCode=" + CollegeCode + "]";
}
public String getCollegeName() {
	return CollegeName;
}
public void setCollegeName(String collegeName) {
	CollegeName = collegeName;
}
public int getCollegeCode() {
	return CollegeCode;
}
public void setCollegeCode(int collegeCode) {
	CollegeCode = collegeCode;
}
private int CollegeCode;
}
