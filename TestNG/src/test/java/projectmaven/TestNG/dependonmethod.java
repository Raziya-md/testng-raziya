package projectmaven.TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class dependonmethod {

	
	@Test
    public void testMethod1() {
        System.out.println("Running testMethod1...");
        Assert.assertTrue(true, "Method 1 passed");
    }

    @Test(dependsOnMethods = "testMethod1")
    public void testMethod2() {
        System.out.println("Running testMethod2...");
        Assert.assertTrue(true, "Method 2 passed");
    }

    @Test(dependsOnMethods = "testMethod2")
    public void testMethod3() {
        System.out.println("Running testMethod3...");
        Assert.assertTrue(true, "Method 3 passed");
    }

    @Test(dependsOnMethods = "testMethod2", alwaysRun = true)
    public void testMethod4() {
        System.out.println("Running testMethod4 (always run)...");
        Assert.assertTrue(true, "Method 4 passed");
    }

}
