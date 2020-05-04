package com.tests.MavanProject3;

import org.testng.annotations.Test;

public class SeleniumTest {
  
	 @Test
	//@Test(enabled=false)  //skip of test case 
	public void DoLogin(){
	System.out.println("Executing Login Test");
}
	@Test
	public void UserRegistration(){
	System.out.println("Resistering User");
}
}