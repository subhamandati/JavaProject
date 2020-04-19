package com.icici.loans.homeloans;

public class Hdfc implements Rbi{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc h = new Hdfc();
		h.deposit();
		h.withrawl();
		

	}

	@Override
	public void withrawl() {
		System.out.println("Iam overriding withrawl in hdfc");// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
		System.out.println("Iam overriding deposit in hdfc");// TODO Auto-generated method stub
		
	}

}
