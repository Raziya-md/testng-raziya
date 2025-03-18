package assignmentmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class suggestionclassexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(Driver.getCurrentUrl());
		Driver.findElement(By.id("autocomplete")).sendKeys("India");
		Driver.close();
	}

}
