package assignmentmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dmart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.dmart.in/category/dmart-grocery-aesc-grocerycore2");
		System.out.println(Driver.getTitle());
		Driver.findElement(By.xpath("//button[@title='SignIn / Register']")).click();
		Driver.findElement(By.name("mobileNumber")).sendKeys("6305064313");
		Driver.findElement(By.xpath("//button[@type='submit']")).click();
		Driver.findElement(By.name("firstName")).sendKeys("Raziya");
		Driver.findElement(By.name("lastName")).sendKeys("Sulthana");
		Driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
