package com.qtech.intership.dayone;

public class Department extends College {
private String DeptName;
private String HodName;
public String getDeptName() {
	return DeptName;
}
public void setDeptName(String deptName) {
	DeptName = deptName;
}
public String getHodName() {
	return HodName;
}
public void setHodName(String hodName) {
	HodName = HodName;
}
@Override
public String toString() {
	return "Department [DeptName=" + DeptName + "]";
}
}
