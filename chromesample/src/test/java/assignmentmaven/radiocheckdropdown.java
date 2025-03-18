package assignmentmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class radiocheckdropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		// driver.findElement(By.xpath("//input[@value='radio2']")).click();
		// driver.findElement(By.xpath("//input[@value='radio3']")).click();
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByIndex(1);
		driver.findElement(By.id("checkBoxOption2")).click();
		driver.findElement(By.id("name")).sendKeys("Raziya");
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();

		// driver.quit();

	}
}