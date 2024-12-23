package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TestClassTwo {
    //with parameters set in xml
    @Test(groups = "group 1")
    @Parameters("myName")
    public void parameterTest(@Optional String myName) {
        System.out.println("Parameterized value is : " + myName);
    }

    //with parameter in dataprovider
    @DataProvider(name = "numbers")
    public static Object[][] numbers() {
        return new Object[][]{
                {
                        new int[]{1, 2, 3, 4, 5},
                        15
                }
        };
    }

    @Test(dataProvider = "numbers")
    public void testSum(int[] numbers, int expectedResult) {
        assertEquals(BasicClass.getSum(numbers), expectedResult, "Sum value is incorrect");
    }
}