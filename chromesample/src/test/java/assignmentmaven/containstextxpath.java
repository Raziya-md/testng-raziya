package assignmentmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class containstextxpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://rahulshettyacademy.com/practice-project";
		driver.get(Url);
		System.out.println(Url);
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Join now to')]"));
		if (text.isDisplayed()) {
			System.out.println("yes text element is present");
		} else {
			System.out.println("yes text element is not present");
		}

	}

}
