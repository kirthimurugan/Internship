package com.qtech.intership.dayone;

public class ParentClass {
	
	int add(int a,int b) {
		System.out.println("Parent Class");
		return a+b;
	}
	int add(int a,int b,int c) {
		System.out.println("Parent Class");
		return a+b+c;
	}
	float add(float a,float b) {
		System.out.println("Parent Class");
		return a+b;
	}
	float add(int a,float b) {
	    System.out.println("Parent Class");
	    return a+b;
	}
	float add(float a,int b) {
		System.out.println("Parent Class");
		return a+b;
	}
public static void main(String[]args) {
ParentClass p=new ParentClass();
System.out.println(p.add(45,89));
System.out.println(p.add(112,23));
}

}
