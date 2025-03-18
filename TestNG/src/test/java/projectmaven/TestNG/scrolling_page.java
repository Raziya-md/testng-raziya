package projectmaven.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class scrolling_page {
	WebDriver driver;
	@BeforeMethod
	public void Launch_URL() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
		//driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		
	}
	@Test
	public void scrolling_toptobottom() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); 
		WebElement scroll=driver.findElement(By.xpath("//div[text()='Best Deals on Smartphones']"));
		js.executeScript("arguments[0].scrollIntoView(true);",scroll);
		Thread.sleep(1000);
		WebElement bottom_scroll=driver.findElement(By.xpath("//h2[text()='Grocery/Supermart']"));
		js.executeScript("arguments[0].scrollIntoView(true);",bottom_scroll);
		Thread.sleep(1000);
		WebElement top_scroll=driver.findElement(By.xpath("//span[text()='Mobiles']"));
		js.executeScript("arguments[0].scrollIntoView(true);",top_scroll);
				
	}
}
