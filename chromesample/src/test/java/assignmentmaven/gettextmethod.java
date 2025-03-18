package assignmentmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettextmethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(Url);
		System.out.println(Url);
		WebElement btn = driver.findElement(By.xpath("//button[text()='Open Window']"));
		String value = btn.getText();
		if (value.equals("Open Window")) {
			System.out.println("yes text spelling is corect");
		}
	}

}
