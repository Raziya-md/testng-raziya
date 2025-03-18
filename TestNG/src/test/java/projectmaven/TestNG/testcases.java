package projectmaven.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class testcases {
WebDriver driver;
//Open Browser and Launch URL
@BeforeMethod
public void instagramlogin() {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
	System.out.println(driver.getCurrentUrl());

}
  @Test(priority=0)
public void TC01_verifylogin(){  
	// verify page title
		WebElement pagetitle = driver.findElement(By.xpath("//div[text()='Log in']"));
	if (pagetitle.isDisplayed()) {
	System.out.println("Successfully Navigated to Signin page");
	} else {
	System.out.println("Failed to navigate to Signin Page");
	}
	//valid email id/phone number in  text box.
	WebElement  emailid= driver.findElement(By.name("username"));
	emailid.clear();
	emailid.sendKeys("raziyasulthana.mba@gmail.com");
	//valid password in p/w text box.
	WebElement password=driver.findElement(By.name("password"));
	password.clear();
	password.sendKeys("raziyamd0786");
	//login button
WebElement loginbutton=	driver.findElement(By.xpath("//button[@type='submit']"));
loginbutton.click(); 
//verify user lands on home page
WebElement homepage = driver.findElement(By.xpath("//span[text()='About']"));
if (homepage.isDisplayed()) {
System.out.println("Successfully Navigated to home page");
} else {
System.out.println("Failed to navigate to home Page");
} 
}
@Test(priority=1)
public void logout() throws InterruptedException {
	
	//logout from instagram
	
WebElement pagetitle = driver.findElement(By.xpath("//div[text()='Log in']"));
if (pagetitle.isDisplayed()) {
System.out.println("Successfully Navigated to Signin page");
} else {
System.out.println("Failed to navigate to Signin Page");
}
//valid email id/phone number in  text box.
WebElement  emailid= driver.findElement(By.name("username"));
emailid.clear();
emailid.sendKeys("raziyasulthana.mba@gmail.com");
//valid password in p/w text box.
WebElement password=driver.findElement(By.name("password"));
password.clear();
password.sendKeys("raziyamd0786");
//login button
WebElement loginbutton=	driver.findElement(By.xpath("//button[@type='submit']"));
loginbutton.click(); 
//verify user lands on home page
WebElement homepage = driver.findElement(By.xpath("//span[text()='About']"));
if (homepage.isDisplayed()) {
System.out.println("Successfully Navigated to home page");
} else {
System.out.println("Failed to navigate to home Page");
} 
//user able to logout from more option  //span tag as it is dropdown
WebElement more = driver.findElement(By.xpath("(//span[@class='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft'])[14]"));
more.click();
Select logout = new Select (more);
logout.selectByVisibleText("Log out");
//Thread.sleep(2000);
WebElement logoutButton = driver.findElement(By.xpath("//span[@class='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft']"));
logoutButton.click();

}
@AfterMethod
public void closeBrowser() {
driver.close();


}}