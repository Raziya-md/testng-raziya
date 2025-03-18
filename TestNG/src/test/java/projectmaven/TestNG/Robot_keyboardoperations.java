package projectmaven.TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Robot_keyboardoperations {
	WebDriver driver;
	@BeforeMethod
	public void Launch_URL() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.guvi.in/");
		System.out.println(driver.getCurrentUrl());
}
@Test
public void keyboardactions() throws InterruptedException, AWTException {
	WebElement courses = driver.findElement(By.linkText("Courses"));
	courses.click();
	
	//I want to press Down arrow and I want to press Tab ....UP
	
	Robot rb = new Robot();
	
		System.out.println("Hello");
	rb.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(5000);
	rb.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(5000);
	rb.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(5000);
	System.out.println("Hello");
	rb.keyPress(KeyEvent.VK_TAB);	
	Thread.sleep(5000);
	System.out.println("Hello");
	rb.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(5000);
}
}