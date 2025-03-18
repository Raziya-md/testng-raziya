package projectmaven.TestNG;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class mouseactions {
WebDriver driver;
	
	//@Parameters({"URL"})
	@BeforeMethod
	public void launch_URL() {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	
	
	}
	@Test
	public void mouse_actions() throws InterruptedException {
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement searchbox=driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		Actions act=new Actions(driver);
		act.moveToElement(searchbox)
		.sendKeys("Automation")
		.keyDown(Keys.SHIFT)
		.keyUp(Keys.SHIFT)
		//.doubleClick()
		.contextClick()
		.keyDown(Keys.SHIFT)
		.keyDown(Keys.SHIFT)
		.keyUp(Keys.SHIFT)
		.build()
		.perform();
		Thread.sleep(1000);
		//obj.keyUp(Keys.SHIFT).doubleClick().perform();
	}
}
