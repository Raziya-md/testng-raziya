package projectmaven.TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotationsexample2 {
	// BeforeClass is executed once before any test method in the current class is run.
    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass: This runs before any test in the class.");
    }

    // BeforeMethod is executed before each test method.
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod: This runs before each test method.");
    }

    // Test method annotated with @Test, the actual test.
    @Test
    public void testCase1() {
        System.out.println("Test case 1: This is the first test.");
        Assert.assertTrue(true, "Test case 1 passed.");
    }

    // Another test method.
    @Test
    public void testCase2() {
        System.out.println("Test case 2: This is the second test.");
        Assert.assertEquals(1 + 1, 2, "Test case 2 passed.");
    }

    // AfterMethod is executed after each test method.
    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod: This runs after each test method.");
    }

    // AfterClass is executed once after all the test methods in the class are finished.
    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass: This runs after all tests in the class.");
    }
}

