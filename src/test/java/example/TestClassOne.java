package example;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestClassOne {
    @BeforeGroups
    public String preconditionsGroups() {
        String s = "Preconditions for the test groups";
        return s;
    }

    @Test(groups = "group 1")
    public void testgroup1() {
        System.out.println("Test #1 for test group 1");
    }

    @Test(groups = "group 1")
    public void testgroup2() {
        System.out.println("Test #2 for test group 1");
    }

    @Test(groups = "group 2")
    public void testgroup3() {
        System.out.println("Test #1 for test group 2");
    }

    @Test(groups = "group 2")
    public void testgroup4() {
        System.out.println("Test #2 for test group 2");
    }

    @Test(groups = {"group 1", "group 2"})
    public void testgroup5() {
        System.out.println("Test #1 for test group 1 & group 2");
    }

    @AfterGroups(enabled = false)
    public void tearDown() {
        System.out.println("TearDown from the test groups");
    }
}