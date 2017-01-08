package com.inheritance.classexample;

public class BaseDerivedClassCastingTest {
	
	public static void main(String args[]){
		B b= new B();
		C c= new C();
		B b1= new C();
		A a = new B();
		C c1 = (C) new B();
		System.out.println(c1);
		
	}

	// can assign derived class object to base class with out casting 
	//cant assign base class to derived class object as derived object cant hold super class object even if u do type casting you will get run time error
}
