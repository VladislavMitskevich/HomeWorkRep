package hw03.mats_statDemo;

import hw03.math_statistics.MathUtil;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        MathUtil mU = new MathUtil();
        int[] numbers = mU.generateRandomNumbers(5, 1, 5);
        System.out.println(Arrays.toString(numbers));
        System.out.println(mU.getCountNumbersEqualTo(numbers, 3));
        System.out.println(mU.getCountEvenNumbers(numbers));
        System.out.println(mU.getCountNumbersEqualToZero(numbers));
        System.out.println(mU.getCountOddNumbers(numbers));
    }
}
