package projectmaven.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paralleltesting {
	WebDriver driver;
	//Open Browser and Launch URL
		@Test
		public void Dmartlogin() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.dmart.in/category/dmart-grocery-aesc-grocerycore2");
		System.out.println(driver.getCurrentUrl());
	//}	
	//public void pagetitle() throws InterruptedException {
	//String pageTitle = driver.getTitle();
	//if (pageTitle.equals("Daily Offers, Daily Discounts on DMart Ready")) {
	//System.out.println("User successfully launch the uRL and landed to home page");
	//} else {
	//System.out.println("Failed to navigate to Home Page");
	//}
	//register sign in 
	WebElement signin = driver.findElement(By.xpath("//button[@title='SignIn / Register']"));
	signin.click();
	//user should able to enter the mobile no.
	WebElement mobileno=driver.findElement(By.name("mobileNumber"));
	mobileno.sendKeys("6305064313");
	//user should able to click the submit button
	WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
	submit.click();
	//user should able to enter the first name
	Thread.sleep(1000);
	WebElement firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
	firstname.clear();
	firstname.sendKeys("Raziya");
	//user should able to enter the last name
	WebElement lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
	lastname.clear();
	lastname.sendKeys("Sulthana");
		//submit button for login
	WebElement submitbutton= driver.findElement(By.xpath("//button[@type='submit']"));
	submitbutton.click();
	Thread.sleep(2000);
//verify with otp
	WebElement verify = driver.findElement(By.xpath("//p[contains(text(),'Almost Done!')]"));
	if (verify.isDisplayed()) {
	System.out.println("Successfully Navigated to verification page");
	} else {
	System.out.println("Failed to navigate to verification Page");
	}
	}	
	
	
	//Open Browser and Launch URL
	
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\MUBINA\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.dmart.in/category/dmart-grocery-aesc-grocerycore2");
		System.out.println(driver.getCurrentUrl());
	//}
		 
	//public void pagetitle1() throws InterruptedException {
	//String pageTitle1 = driver.getTitle();
//	if (pageTitle1.equals("Daily Offers, Daily Discounts on DMart Ready")) {
	//System.out.println("User successfully launch the uRL and landed to home page");
	// } else {
	//System.out.println("Failed to navigate to Home Page");
	// }
	//register sign in 
	WebElement signin = driver.findElement(By.xpath("//button[@title='SignIn / Register']"));
	signin.click();
	//user should able to enter the mobile no.
	WebElement mobileno=driver.findElement(By.name("mobileNumber"));
	mobileno.sendKeys("6305064313");
	//user should able to click the submit button
	WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
	submit.click();
	//user should able to enter the first name
	Thread.sleep(1000);
	WebElement firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
	firstname.clear();
	firstname.sendKeys("Raziya");
	//user should able to enter the last name
	WebElement lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
	lastname.clear();
	lastname.sendKeys("Sulthana");
		//submit button for login
	WebElement submitbutton= driver.findElement(By.xpath("//button[@type='submit']"));
	submitbutton.click();
	Thread.sleep(2000);
//verify with otp
	WebElement verify = driver.findElement(By.xpath("//p[contains(text(),'Almost Done!')]"));
	if (verify.isDisplayed()) {
	System.out.println("Successfully Navigated to verification page");
	} else {
	System.out.println("Failed to navigate to verification Page");
	}
	}	
	 
}
