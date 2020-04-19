package com.inheratance;

public class B extends A{

	public static void main(String[] args) {
		
		B b =new B();
		b.m2();
		A a = new A();
		a.m1();
		

	}
	
	public void m2() 
	{
	System.out.println("I am m2 in class B");	
	}

}
