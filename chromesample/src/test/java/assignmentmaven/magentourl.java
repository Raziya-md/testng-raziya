package assignmentmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class magentourl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://magento.softwaretestingboard.com/gear.html";
		driver.get(Url);
		System.out.println(Url);
//WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
//search.sendKeys("bags");
		/*
		 * Actions builder = new Actions(driver); Actions seriesOfActions =
		 * builder.sendKeys(search, "bags").click();
		 * builder.moveToElement(search).perform();
		 */

		Select women = new Select(driver.findElement(By.linkText("Women")));
		women.selectByIndex(1);
	}

}
