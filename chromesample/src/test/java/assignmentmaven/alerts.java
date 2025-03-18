package assignmentmaven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(Url);
		System.out.println(Url);
		WebElement textbox = driver.findElement(By.id("name"));
		if (textbox.isDisplayed()) {
			textbox.clear();
			textbox.sendKeys("Raziya");
		} else {
			System.out.println("text box is present");
		}
//clicking alert button
		WebElement alert = driver.findElement(By.id("alertbtn"));
		if (alert.isDisplayed()) {
			alert.click();
			System.out.println("alert button is clicked successfully");
		} else {
			System.out.println("alert button is not clicked successfully");
		}
		Thread.sleep(3000);
//handling the alert popup window using alert class
		Alert popup = driver.switchTo().alert();
//popup.accept();   //it will click on default button in the alert
//popup.dismiss();    //it will close the popup window

		String exptext = popup.getText();
		String accpttext = "Hello Raziya, share this practice page and share your knowledge";
		if (exptext.equals(accpttext)) {
			System.out.println("alert displayed successfully");
			popup.accept();
		}

//after closing of alert then click radio button
		driver.findElement(By.xpath("//input[@value='radio1']")).click();

	}

}
