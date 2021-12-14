package com.automation.Base;

import org.testng.annotations.Test;

public class TestNG_priority {
	
	@Test(priority=1)
	public void signup() {
		System.out.println("signup");
		
	}
	
	@Test(priority=2)
	public void login() {
		System.out.println("login");	
		
}
	@Test(priority=3)
	public void searchproduct() {
		
		System.out.println("searchproduct");
		
	}
	@Test(priority=4)
	public void addtocart() {
		
		System.out.println("addtocart");
		
	}
	@Test(priority=5)
	public void payment() {
		System.out.println("payment");
		
	}
	@Test(priority=6)
	public void signout() {
		System.out.println("signout");
	}
	
	}