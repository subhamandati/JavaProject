package com.icici.loans.homeloans;

public interface Rbi {
	
	public void withrawl();
	public void deposit();
	
	public static void main(String[] args) {
		Rbi r1 =new Hdfc();
		r1.deposit();
		r1.withrawl();
		
	}

}
