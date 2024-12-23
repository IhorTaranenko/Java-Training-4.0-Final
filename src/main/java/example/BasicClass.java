package example;

import java.util.Arrays;

public class BasicClass {
    public static int getSum(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }
    //System.out.println("Hello from Testng!");
}