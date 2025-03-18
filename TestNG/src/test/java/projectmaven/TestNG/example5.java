package projectmaven.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class example5 {

	@BeforeTest
	public void getURL(){
		System.out.println("open the URL");
	}
	@BeforeMethod
	public static void login() {
		System.out.println("login the url");
	}
	@Test(priority=0)
	public void credentials() {
		System.out.println("enter the name and p/w in given url");
	}
	@Test(priority=1)
	public void addtocart() {
		System.out.println("add the products to cart");
	}
	@AfterMethod
	public static void logout() {
		System.out.println("logout the url");
	}
	@AfterTest
	public void close() {
		System.out.println("close  the entire url");
	}
	
}
