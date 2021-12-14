package com.automation.Base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base {
	@BeforeTest
	public void test1() {
		
		System.out.println("I am from Before test");
		

	}
	@BeforeMethod
	public void test2() {
		System.out.println("I am from Before Method");

	}
	@Test
	public void test3() {
		System.out.println("I am from  test");

	}
	@AfterMethod
	public void test4() {
		System.out.println("I am from After Method");

	}
	@AfterClass
	public void test5() {
		
		System.out.println("I am from After Case");
	}

	@Test
	public void test6() {
		System.out.println("I am also from Test");
	}
	
}
