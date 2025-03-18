package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlelaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.gmail.com");
		String appURL = driver.getCurrentUrl();
//String pagetitle =driver.getTitle();
		System.out.println(driver.getCurrentUrl());
//System.out.println(driver.getTitle());
		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("raziyasulthana.mba@gmail.com");
//driver.findElement(By.id("pass")).sendKeys("raziyamd786");
//driver.findElement(By.name("login")).click(); 

	}

}
