package projectmaven.practiceprograme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cromelaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://www.google.com/";
		driver.get(URL);
		driver.manage().window().maximize();
		driver.getTitle();
		String pageTitle = driver.getTitle();
		System.out.println(driver.getTitle());
		if (pageTitle.equals("Google")) {
			System.out.println("if page title shows then proceed");
		} else {
			System.out.println("if page title do not shows then dont proceed");
		}

	}
}
