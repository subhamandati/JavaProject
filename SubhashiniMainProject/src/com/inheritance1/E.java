package com.inheritance1;

import com.inheratance.D;

public class E extends D{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e = new E();
		e.m1();
		e.m3();
		e.m4();
		e.m5();
		
		D d=new D();
		d.m4();
		
		

	}
	public void m5()
	{
		System.out.println("I am M5 in class E");
	}
	
	public void m4()
	{
		System.out.println("I am overiding m4 in Class D");
	}

}
