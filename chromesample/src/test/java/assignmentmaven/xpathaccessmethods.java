package assignmentmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathaccessmethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(Url);
		System.out.println(Url);

		/*
		 * //parent to child WebElement chkbox=driver.findElement(By.xpath(
		 * "//label[@for='benz']//input[@id='checkBoxOption2']")); if
		 * (chkbox.isDisplayed()){ chkbox.click(); if (chkbox.isSelected()){
		 * System.out.println("checkbo2  is selected successfully"); }else {
		 * System.out.println("checkbox is not selected"); } }
		 */

		/*
		 * //grandparent to child WebElement radio=driver.findElement(By.xpath(
		 * "//div[@id='radio-btn-example']//fieldset//label[@for='radio1']//input[@value='radio1']"
		 * )); if (radio.isDisplayed()) { System.out.println("click the radio button1");
		 * } radio.click();
		 */

//check box section is displayed or not
//*[@id='checkBoxoption3']/../../..
//*[@id='checkBoxoption3']//parent::label//parent::fieldset//parent::div
//*[@id='checkBoxoption3']//ancestor::div//[@id='checkbox-example']

//ancestor 
		/*
		 * WebElement checkbox=driver.findElement(By.xpath(
		 * "//*[@id='checkBoxOption3']//ancestor::div[@id='checkbox-example']")); if
		 * (checkbox.isDisplayed()) {
		 * System.out.println("checkbox3  is displayed sucessfully"); }else {
		 * System.out.println("checkbox is not displayed"); }
		 */

//following sibling
		/*
		 * WebElement CBK=driver.findElement(By.
		 * xpath("//legend[text()='Checkbox Example']//following-sibling::label[@for='benz']"
		 * )); if (CBK.isDisplayed()) { CBK.click();
		 * System.out.println("checkbox2  is displayed sucessfully"); }else {
		 * System.out.println("checkbox is not displayed"); }
		 */

//preceding sibling
		WebElement radio = driver.findElement(By.xpath("//*[@for='radio2']//preceding-sibling::*[@for='radio1']"));
		if (radio.isDisplayed()) {
			System.out.println("radiobtn  is displayed sucessfully");
		} else {
			System.out.println("radiobtn is not displayed");
		}

	}
}
