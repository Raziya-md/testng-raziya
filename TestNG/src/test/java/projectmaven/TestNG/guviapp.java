package projectmaven.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class guviapp {
WebDriver driver;
@BeforeMethod
public void launchingURL() {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://www.guvi.in/blog/automation-testing-project-ideas/");
	System.out.println(driver.getCurrentUrl());
}	
@Test(priority=0)
public void pagetitle() throws InterruptedException {
String pageTitle = driver.getTitle();
if (pageTitle.equals("7 Best Automation Testing Project Ideas - GUVI Blogs")) {
System.out.println("User successfully launch the uRL and landed to home page");
} else {
System.out.println("Failed to navigate to Home Page");
}
WebElement signin=driver.findElement(By.xpath("//a[@id='signup_btn']"));
signin.click();
//Thread.sleep(1000);
//switch to iframe
//driver.switchTo().frame("gsi_159926_41780-overlay");
/*WebElement verify = driver.findElement(By.xpath("//p[text()='Or Sign Up with Email']"));
if (verify.isDisplayed()) {  
System.out.println("Successfully Navigated to signup page");
} else {
System.out.println("Failed to navigate to signup Page");
}*/
WebElement fullname=driver.findElement(By.xpath("//input[@id='name']"));
fullname.sendKeys("Raziya");
WebElement emailid=driver.findElement(By.xpath("//input[@id='email']"));
emailid.sendKeys("Raziyasulthana.mba@gmail.com");
WebElement password=driver.findElement(By.xpath("///input[@id='password']"));
password.sendKeys("Raziyamd0786");
WebElement mobileno=driver.findElement(By.xpath("//input[@id='mobileNumber']"));
mobileno.sendKeys("6305064313");
WebElement submit=driver.findElement(By.xpath("//a[@id='signup-btn']"));
submit.click();
//driver.switchTo().defaultContent();

}
}

