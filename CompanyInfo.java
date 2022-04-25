package com.company;

public class CompanyInfo {
	private void companyName() {
		System.out.println("Company Name is Comcast");

	}
	private void companyId() {
		System.out.println("Company Id is 2410");
		
	}
	private void companyAddress() {
		System.out.println("Company Address  is chennai");
	}
	public static void main(String[] args) {
		CompanyInfo ci = new CompanyInfo();
		ci.companyAddress();
		ci.companyId();
		ci.companyName();
	}
	

}
