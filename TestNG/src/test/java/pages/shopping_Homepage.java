package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class shopping_Homepage {
WebDriver driver;
JavascriptExecutor js=(JavascriptExecutor)driver;

@FindBy(xpath="//p[text()=' Product(s) found']")
WebElement verify_homepage;

@FindBy(xpath="//span[text()='XL']")
WebElement btn_size;

@FindBy (xpath="(//button[text()='Add to cart'])[1]")
WebElement btn_Addtocart1;

@FindBy (xpath="//span[text()='X']")
WebElement link_closecart;

@FindBy (xpath="(//button[text()='Add to cart'])[5]")
WebElement btn_Addtocart5;

@FindBy (xpath="(//button[text()='Add to cart'])[8]")
WebElement btn_Addtocart8;

@FindBy(xpath="//div[@class='sc-1h98xa9-2 fGgnoG']")
WebElement btn_cart;

@FindBy(xpath="(//p[text()='Cropped Stay Groovy off white'])[2]")
WebElement txt_verifyproduct;

@FindBy(xpath="(//button[text()='+'])[2]")
WebElement btn_increment;

@FindBy(xpath="(//button[text()='-'])[2]")
WebElement btn_decrement;

@FindBy(xpath="//p[text()='$ 43.60']")
WebElement verify_subtotal;

@FindBy(xpath="//button[text()='Checkout']")
WebElement btn_checkout;

public shopping_Homepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void verify_homepage() {
	verify_homepage.getText();
	System.out.println(verify_homepage.getText());
	}

public void btn_size() {
	js.executeScript("arguments[0].click();",btn_size);
	//btn_size.click();
}
public void btn_Addtocart1() {
		js.executeScript("arguments[0].click();",btn_Addtocart1);
	//btn_Addtocart1.click();
}
public void link_closecart() {
		js.executeScript("arguments[0].click();",link_closecart);
	//link_closecart.click();
}
public void btn_Addtocart5() {
	js.executeScript("arguments[0].click();",btn_Addtocart5);
	//btn_Addtocart5.click();
}
public void btn_Addtocart8() {
	js.executeScript("arguments[0].click();",btn_Addtocart8);
	//btn_Addtocart8.click();
	}
public void btn_cart() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",btn_cart);
	//btn_cart.click();
}
public void txt_verifyproduct() {
	txt_verifyproduct.getText();
	System.out.println(txt_verifyproduct.getText());
}
public void btn_increment() {
	js.executeScript("arguments[0].click();",btn_increment);
	//btn_increment.click();
}
public void btn_decrement() {
	js.executeScript("arguments[0].click();",btn_decrement);
	//btn_decrement.click();
}
public void verify_subtotal() {
	verify_subtotal.getText();
	System.out.println(verify_subtotal.getText());
}
public void btn_checkout() {
	js.executeScript("arguments[0].click();",btn_checkout);
	//btn_checkout.click();
	Alert obj=driver.switchTo().alert();
	//WebDriverWait wait = new WebDriverWait(driver,100);
	//wait.until(ExpectedConditions.alertIsPresent());
		obj.getText();
		System.out.println(obj.getText());
		obj.accept();
	}
}
