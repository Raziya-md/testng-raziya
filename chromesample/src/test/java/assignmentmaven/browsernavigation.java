package assignmentmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsernavigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Dmart = "https://www.dmart.in/category/dmart-grocery-aesc-grocerycore2";
		String Rahuls = "https://rahulshettyacademy.com/AutomationPractice/";
		String google = "https://www.google.com/";
		String FB = "https://www.facebook.com/";

		driver.get(Dmart);
		driver.get(Rahuls);
		driver.get(google);
		driver.get(FB);

		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().forward();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.get(FB);
		driver.get(Dmart);
		driver.navigate().to(FB);

	}

}
