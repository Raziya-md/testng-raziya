package projectmaven.practiceprograme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsernavigationmethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String URL1 = "https://parabank.parasoft.com/parabank/index.htm";
		String URL2 = "https://artoftesting.com/samplesiteforselenium";
		String URL3 = "https://demoqa.com/alerts";
		String URL4 = "https://www.tutorialspoint.com/selenium/practice/frames.php";
		String URL5 = "https://www.hyrtutorials.com/p/frames-practice.html";

		driver.get(URL1);
		driver.get(URL2);
		driver.get(URL3);
		driver.get(URL4);
		driver.get(URL5);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		driver.close();

	}

}
