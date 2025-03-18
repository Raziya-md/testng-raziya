package projectmaven.practiceprograme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://demoqa.com/alerts";
		driver.get(URL);
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.getTitle();
		String pageTitle = driver.getTitle();
		System.out.println(driver.getTitle());
		if (pageTitle.equals("DEMOQA")) {
			System.out.println("if page title shows then proceed");
		} else {
			System.out.println("if page title do not shows then dont proceed");
		}
		Thread.sleep(50000);
		/*
		 * WebElement alert1= driver.findElement(By.id("alertButton")); alert1.click();
		 * Alert obj= driver.switchTo().alert(); obj.accept(); //obj.dismiss();
		 * 
		 * Thread.sleep(500);
		 * driver.manage().timeouts().pageLoadTimeout(10000,TimeUnit.SECONDS);
		 * WebElement alert2= driver.findElement(By.id("timerAlertButton"));
		 * alert1.click(); Thread.sleep(1000); Alert obj2= driver.switchTo().alert();
		 * //obj2.accept();
		 * 
		 * 
		 * driver.manage().timeouts().pageLoadTimeout(10000,TimeUnit.SECONDS);
		 * WebElement alert3= driver.findElement(By.id("confirmButton"));
		 * alert3.click(); Thread.sleep(20000); Alert obj3 = driver.switchTo().alert();
		 * obj3.dismiss();
		 */

		driver.manage().timeouts().pageLoadTimeout(90000, TimeUnit.SECONDS);
		WebElement alert4 = driver.findElement(By.id("promtButton"));
		alert4.click();
		Alert obj4 = driver.switchTo().alert();
		obj4.sendKeys("Amrutha");
		Thread.sleep(2000);
		obj4.accept();
	}

}
