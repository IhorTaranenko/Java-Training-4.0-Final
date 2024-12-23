package example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleTest {
    @BeforeMethod
    public void setUp() {
        System.out.println("Set up from BeforeMethod");
    } // Perform setup actions before each test method

    @Test
    public void test1() {
        System.out.println("Test #1");
    }

    @Test
    public void test2() {
        System.out.println("Test #2");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("TearDown from AfterMethod");
    } // Perform teardown actions after each test method
}