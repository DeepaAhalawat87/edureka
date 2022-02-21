package com.edureka.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyProfilePage {

	WebDriver driver;
	Select s;
	@FindBy(xpath="//span[@class='user_image']")
	public WebElement userImg;
	
	
	@FindBy(xpath="(//a[text()='My Profile'])[1]")
	public WebElement clickMyProfile;
	
	@FindBy(xpath="(//i[@class='icon-down-arrow_ico'])[2]")
	public WebElement clickPopupIcon;
	
	@FindBy(xpath="(//i[@class='icon-pr-edit'])[1]")
	public WebElement clickEditLink;
	
	@FindBy(id="fullName")
	public WebElement fullName;
	
	@FindBy(xpath="//button[contains(@class,'btn_save pull-right')]")
	public WebElement saveAndContinueBtn;
	
	@FindBy(xpath="//a[contains(@href,'career-service')]")
	public WebElement careerServicesLink;
	
	@FindBy(name="currentIndustry")
	public WebElement industryElement;
	
	@FindBy(name="currentjob")
	public WebElement selectJobLevel;
	
	@FindBy(name="userSkill")
	public WebElement skill;
	
	@FindBy(xpath="//button[@Class='btn pull-right onboarding-primary-button']")
	public WebElement nextBtn;
	
	@FindBy(xpath="//select[@name='interestedJob']")
	public WebElement interestedJobSelect;
	
	@FindBy(name="elementType")
	public WebElement employmentType;
	
	@FindBy(xpath="//button[contains(@class,'dropdown dropdown-toggle')]")
	public WebElement dropdownBtn;
	
	@FindBy(xpath="//input[@class='country-search']")
	public WebElement countrySearch;
	
	@FindBy(xpath="//div[@class='ps-content']/li")
	public List<WebElement> dropdownList;
	
	@FindBy(xpath="//input[@placeholder='Enter your city']")
	public WebElement city;
	
	@FindBy(xpath="(//i[@class='icon-pr-edit'])[2]")
	public WebElement carrerInterestEditIcon;
	
	@FindBy(name="lastDrawnSalaryUS")
	public WebElement expectedCTC;
	
	@FindBy(xpath="//button[text()='Next']")
	public WebElement nextButton;
	
	@FindBy(xpath="//button[@class='btn pull-right onboarding-primary-button']")
	public WebElement saveButton;
	
	@FindBy(xpath="//img[@class='user_image']")
	public WebElement userImageIcon;
	
	
	@FindBy(xpath="(//a[@class='dropdown-item'])[5]")
	public WebElement logoutLink;
	
	public MyProfilePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickPopup()
	{
		this.clickPopupIcon.click();
	}

	public void clickUserImageIcon()
	{
		
		this.userImg.click();
	}
	
	public void clickMyProfileLink()
	{
		this.clickMyProfile.click();
	}
	
	public void clickEditLink()
	{
		this.clickEditLink.click();
		
	}
	
	public void updateName(String name)
	{
		this.fullName.clear();
		this.fullName.sendKeys(name);
	}
	
	public void clickSaveAndContinueButton()
	{
		this.saveAndContinueBtn.click();
	}
	
	public void navigateBack(String url)
	{
		driver.navigate().to(url);
		
	}
	
	public void clickCareerServicesLink()
	{
		this.careerServicesLink.click();
	}
	
	public void selectIndustry()
	{
		s=new Select(industryElement);
		s.selectByIndex(2);
	}
	
	public void enterSkills()
	{
		this.skill.clear();
		this.skill.sendKeys("Java");
	}
	
	public void clickNextButton()
	{
		//this.nextBtn.sendKeys(Keys.ENTER);
		Actions act=new Actions(driver);
		act.moveToElement(nextBtn).click();
		
		System.out.println("inside click method");
	}
	
	public void selectJobLevel()
	{
		s=new Select(selectJobLevel);
		s.selectByIndex(2);
	}
	
	public void selectJobType()
	{
		s=new Select(interestedJobSelect);
		s.selectByIndex(6);
	}
	
	public void selectEmploymentType()
	{
		s=new Select(employmentType);
		s.selectByIndex(2);
	}
	
	public void selectCountryAndCity()
	{
		this.dropdownBtn.click();
		this.countrySearch.sendKeys("United");
		
		for(WebElement e:this.dropdownList)
		{
			if(e.getText().equalsIgnoreCase("United States"))
			{
				e.click();
				break;
			}
		}
		this.city.clear();
		this.city.sendKeys("Irvine");
		
	}
	
	public void clickCarrerInterestEditIcon()
	{
		this.carrerInterestEditIcon.click();
		
	}
	
	public void selectExpectedCTC()
	{
		s=new Select(expectedCTC);
		s.selectByIndex(2);
	}
	
	public void clickNextButton2()
	{
		this.nextButton.click();
		
	}
	
	public void clickSaveButton()
	{
		this.saveButton.click();
	}
	
	public void clickImageIcon()
	{
		this.userImageIcon.click();
	}
	
	public void logout()
	{
		this.logoutLink.click();
	}
}


