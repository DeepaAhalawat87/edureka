package com.edureka.testCases;

import org.testng.annotations.Test;

import com.edureka.initiateTest.InitClass;

public class LoginPageTest extends InitClass{

	
	@Test
	public void VerifyLogin()
	{
		loginPage.clickLoginLink();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginPage.setUserName("deepaahlawat21@gmail.com");
		loginPage.setPassword("Vaidik@2021");
		loginPage.clickLogin();
		
	}
	
}
