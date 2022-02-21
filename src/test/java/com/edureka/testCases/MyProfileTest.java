package com.edureka.testCases;

import org.testng.annotations.Test;

import com.edureka.initiateTest.InitClass;

public class MyProfileTest extends InitClass {

	@Test
	public void updateCandidateDetails() throws InterruptedException
	{   
		loginPage.clickLoginLink();
		Thread.sleep(3000);
		loginPage.setUserName("deepaahlawat21@gmail.com");
		loginPage.setPassword("Vaidik@2021");
		loginPage.clickLogin();
		//Thread.sleep(2000);
		//profilePage.clickPopup();
		Thread.sleep(2000);
		profilePage.clickUserImageIcon();
		Thread.sleep(3000);
		profilePage.clickMyProfileLink();
		profilePage.clickEditLink();
		Thread.sleep(4000);
		profilePage.updateName("Deepika Chaudhary");
		Thread.sleep(3000);
		profilePage.clickSaveAndContinueButton();
		Thread.sleep(5000);
		profilePage.navigateBack("https://learning.edureka.co/my-profile");
		Thread.sleep(2000);
		profilePage.clickCareerServicesLink();
		profilePage.clickEditLink();
		profilePage.selectIndustry();
		profilePage.enterSkills();
		profilePage.selectJobLevel();
		Thread.sleep(2000);
		profilePage.clickNextButton();
		System.out.println("next button clicked");
		profilePage.navigateBack("https://learning.edureka.co/onboarding/careerinterests");
		
		
		profilePage.selectEmploymentType();
		Thread.sleep(2000);
		profilePage.selectJobType();
		Thread.sleep(2000);
		//profilePage.selectEmploymentType();
		profilePage.selectCountryAndCity();
		Thread.sleep(2000);
		profilePage.selectExpectedCTC();
		Thread.sleep(2000);
		profilePage.clickNextButton2();
		Thread.sleep(3000);
		profilePage.clickSaveButton();
		profilePage.navigateBack("https://learning.edureka.co/");
		profilePage.clickImageIcon();
		profilePage.logout();
	}
}
