package example;

import org.testng.annotations.Test;

public class TestClassThree {

    @Test(priority = 5, groups = "group 1")
    public void test1() {
        System.out.println("Test #1");
    }

    @Test(priority = 4, groups = "group 1")
    public void test2() {
        System.out.println("Test #2");
    }

    @Test(priority = 3, groups = "group 1")
    public void test3() {
        System.out.println("Test #3");
    }

    @Test(priority = 2, groups = "group 1")
    public void test4() {
        System.out.println("Test #4");
    }

    @Test(priority = 1, groups = "group 1")
    public void test5() {
        System.out.println("Test #5");
    }
}