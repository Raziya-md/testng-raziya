package projectmaven.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class annotations {
	
//@Test
//public void TC1() {
	//System.out.println("TestNG class");}
	
	
@Test(groups= {"smoketest"})
public void test1() {
System.out.println("Test Case 1");
}// Test Case 2
@Test(groups= {"sanity"})
public void test2() {
System.out.println("Test Case 2");
}
@Test(groups= {"regression"})
public void test3() {
System.out.println("Test Case 3");
}
@BeforeMethod
public void beforeMethod() {
System.out.println("Before Method");
}
@AfterMethod
public void afterMethod() {
System.out.println("After Method");
}
@BeforeClass
public void beforeClass() {
System.out.println("Before Class");
}
@AfterClass
public void afterClass() {
System.out.println("After Class");
}
@BeforeTest
public void beforeTest() {
System.out.println("Before Test");
}
@AfterTest
public void afterTest() {
System.out.println("After Test");
}
@BeforeSuite
public void beforeSuite() {
System.out.println("Before Suite");
}
@AfterSuite
public void afterSuite() {
System.out.println("After Suite");
}
}



