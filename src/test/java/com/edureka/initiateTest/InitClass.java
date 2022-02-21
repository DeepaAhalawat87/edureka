package com.edureka.initiateTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.edureka.pageObjects.LoginPage;
import com.edureka.pageObjects.MyProfilePage;
import com.edureka.utilities.PropertyFileUtil;

public class InitClass {

	WebDriver driver;
	protected LoginPage loginPage;
	protected MyProfilePage profilePage;
	
	@BeforeTest
	public void setup() throws Throwable
	{
		if(PropertyFileUtil.getPropertyValue("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//CommonDrivers//chromedriver.exe");
			driver= new ChromeDriver();
			
			
		}
		
		else
			System.out.println("firefox driver");
		driver.manage().window().maximize();
		
		createObjects();
	}
	
	@BeforeClass
	public void launchUrl() throws Throwable
	{
		driver.navigate().to(PropertyFileUtil.getPropertyValue("url"));
		
	}
	
	public void createObjects()
	{
		
		loginPage=new LoginPage(driver);
		profilePage=new MyProfilePage(driver);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
	
}
