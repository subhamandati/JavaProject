package com.icici.loans.homeloans;

public class MyAbstractExtends extends MyFirstAbstract{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyAbstractExtends mbs =new MyAbstractExtends();
		mbs.deposit();
		mbs.wittdrawl();
		
	}

	@Override
	public void wittdrawl() {
		System.out.println("I am overriding withdrawl in My extended calss");
		
	}

}
