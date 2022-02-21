package com.edureka.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	@FindBy(xpath="//span[@class='login_click login-vd giTrackElementHeader ']")
	public WebElement logInLink;
	
	@FindBy(id="si_popup_email")
	public WebElement email;
	
	@FindBy(id="si_popup_passwd")
	public WebElement password;
	
	
	@FindBy(xpath="//button[@class='clik_btn_log btn-block']")
	public WebElement loginBtn;
	
	@FindBy(xpath="(//i[@class='icon-pr-edit'])[1]")
	public WebElement editIcon;
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLoginLink()
	{
		this.logInLink.click();
	}

	public void setUserName(String email)
	{
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	public void setPassword(String password)
	{
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	
	public void clickLogin()
	{
		this.loginBtn.click();
	}
	
	public void clickEditIcon()
	{
		this.editIcon.click();
	}
	
}
