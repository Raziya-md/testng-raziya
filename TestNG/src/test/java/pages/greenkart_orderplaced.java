package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class greenkart_orderplaced {
WebDriver driver;

@FindBy(xpath="//title[text()='GreenKart - veg and fruits kart']")
WebElement txt_pagetitle;

@FindBy(xpath="//b[text()='Product Name']")
WebElement txt_productname;

@FindBy(xpath=("//p[text()='180']"))  //(//p[text()='180'])
WebElement txt_Totalamount;

@FindBy(xpath="//button[text()='Place Order']")
WebElement btn_placeorder;

public greenkart_orderplaced(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void txt_pagetitle() {
		driver.getTitle();
    String pageTitle=driver.getTitle();
    System.out.println(driver.getTitle());
    if (pageTitle.equals("GreenKart - veg and fruits kart")) {
  	  System.out.println("if page title shows then proceed");
    }else {
  	  System.out.println("if page title do not shows then dont proceed");
    }
}
public void txt_productname() {
	WebDriverWait wait =new WebDriverWait(driver,1500);
	if(txt_productname.isDisplayed()) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='Product Name']")));
		System.out.println("product name cauliflower displayed");
					}else {
		System.out.println("product name cauliflower not displayed");
					}
	}

public void txt_Totalamount() {
	txt_Totalamount.getText();
	System.out.println(txt_Totalamount.getText());
	}
public void btn_placeorder() {
	btn_placeorder.click();
}
}
