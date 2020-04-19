package com.icici.loans.homeloans;

public class MyHouse {
	
	public static void main(String[] args) {
		System.out.println("I am in main");
		MyHouse mh1 =new MyHouse();
		mh1.add();
		mh1.sub();
		
	}
	
	int a=10,b=20,c;
	
	public void add()
	{
		c=a+b;	
		System.out.println("Adding A and B " + c);
	}
	
	public void sub()
	{
		c=a-b;	
		System.out.println("Subtracting A and B " + c);
	}

}
