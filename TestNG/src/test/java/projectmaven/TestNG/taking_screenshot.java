package projectmaven.TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.common_methods;

public class taking_screenshot {
	WebDriver driver;
	//Open Browser and Launch URL
	@Parameters({"Dmartlogin"})
	@BeforeMethod
	public void Dmartlogin(String URL) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get(URL);
		System.out.println(driver.getCurrentUrl());
	}
	@Parameters({"mobileno","firstname","lastname"})
	@Test(priority=0)
	public void pagetitle(String mn,String fn,String ln) throws InterruptedException, IOException {
	String pageTitle = driver.getTitle();
	if (pageTitle.equals("Daily Offers, Daily Discounts on DMart Ready")) {
	System.out.println("User successfully launch the uRL and landed to home page");
	} else {
	System.out.println("Failed to navigate to Home Page");
	}
	TakesScreenshot objscr=((TakesScreenshot)driver);
	File srcfile =objscr.getScreenshotAs(OutputType.FILE);
	File Destlocation=new File("D:\\eclipse-workspace\\TestNG\\reports/sample.png");
	FileUtils.copyFile(srcfile,Destlocation);
	
		//register sign in 
	WebElement signin = driver.findElement(By.xpath("//button[@title='SignIn / Register']"));
	signin.click();
	//user should able to enter the mobile no.
	WebElement mobileno=driver.findElement(By.name("mobileNumber"));
	mobileno.sendKeys(mn);
	common_methods obj1 = new common_methods();
    obj1.captureimage(driver);  //screenshot method calling through obj
    
	//user should able to click the submit button
	WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
	submit.click();
	
	//user should able to enter the first name
	Thread.sleep(1000);
	WebElement firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
	firstname.clear();
	firstname.sendKeys(fn);
	//user should able to enter the last name
	WebElement lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
	lastname.clear();
	lastname.sendKeys(ln);
		//submit button for login
	WebElement submitbutton= driver.findElement(By.xpath("//button[@type='submit']"));
	submitbutton.click();
	Thread.sleep(2000);
	
	//common_methods obj1 = new common_methods();
    //obj1.captureimage(driver);  //screenshot method calling through obj
    
//verify with otp
	WebElement verify = driver.findElement(By.xpath("//p[contains(text(),'Almost Done!')]"));
	if (verify.isDisplayed()) {
	System.out.println("Successfully Navigated to verification page");
	} else {
	System.out.println("Failed to navigate to verification Page");
	}
	}	
	
}
