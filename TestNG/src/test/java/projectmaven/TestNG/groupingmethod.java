package projectmaven.TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class groupingmethod {

	 // Runs once before any test methods in this class.
    @BeforeClass
    public void setupClass() {
        System.out.println("BeforeClass: Setting up the class...");
    }

    // Runs before each test method.
    @BeforeMethod
    public void setupMethod() {
        System.out.println("BeforeMethod: Setting up the method...");
    }

    // Test case 1 in the "Smoke" group.
    @Test(groups = "smoke")
    public void testCase1() {
        System.out.println("Test case 1 (Smoke): This is a smoke test.");
        Assert.assertTrue(true, "Test case 1 passed.");
    }

    // Test case 2 in the "smoke" group.
    @Test(groups = "smoke")
    public void testCase2() {
        System.out.println("Test case 2 (Smoke): This is another smoke test.");
        Assert.assertTrue(true, "Test case 2 passed.");
    }

    // Test case 3 in the "regression" group.
    @Test(groups = "regression")
    public void testCase3() {
        System.out.println("Test case 3 (Regression): This is a regression test.");
        Assert.assertEquals(2 + 2, 4, "Test case 3 passed.");
    }

    // Test case 4 is disabled using @Test(enabled = false).
    @Test(enabled = false)
    public void testCase4() {
        System.out.println("Test case 4: This test is disabled and will not run.");
    }

    // Parameterized test method.
    @Test
    @Parameters({"param1", "param2"})
    public void testWithParameters(String param1, String param2) {
        System.out.println("Test with parameters: " + param1 + " and " + param2);
        Assert.assertEquals(param1 + param2, "HelloWorld", "Parameter test passed.");
    }

    // Runs after each test method.
    @AfterMethod
    public void tearDownMethod() {
        System.out.println("AfterMethod: Cleaning up after the test...");
    }

    // Runs once after all test methods in this class.
    @AfterClass
    public void tearDownClass() {
        System.out.println("AfterClass: Cleaning up the class...");
    }

}
