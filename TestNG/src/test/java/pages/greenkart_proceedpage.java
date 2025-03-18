package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class greenkart_proceedpage {
WebDriver driver;

@FindBy(xpath="//label[text()='Choose Country']")
WebElement txt_proceedpage;

@FindBy(xpath="//option[@value='India']//parent::select")
WebElement drp_country;

@FindBy (xpath="//input[@class='chkAgree']")
	WebElement chk_agree;

@FindBy (xpath="//button[text()='Proceed']")
WebElement btn_proceed;

@FindBy(xpath="//span[text()='Thank you, your order has been placed successfully']")
WebElement txt_Thankyoupage;

public greenkart_proceedpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void txt_proceedpage() {
	txt_proceedpage.getText();
	System.out.println(txt_proceedpage.getText());
}
public void drp_country() {
	Select obj=new Select(drp_country);
	obj.selectByValue("India");
}
public void chk_agree() {
	if (chk_agree.isDisplayed()) {
	chk_agree.click();
	System.out.println("checkbox clicked successfully");
}
}
public void btn_proceed() {
	btn_proceed.click();
}
public void txt_Thankyoupage() {
	txt_Thankyoupage.getText();
	System.out.println(txt_Thankyoupage.getText());
}
}
