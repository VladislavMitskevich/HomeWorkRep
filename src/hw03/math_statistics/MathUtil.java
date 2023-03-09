package hw03.math_statistics;

import hw03.math_statistics.inter.Comparison;
import hw03.math_statistics.custom_comparison.CustomComparison;

import java.util.Random;

public class MathUtil {
    public int[] generateRandomNumbers(int size, int lowBound, int highBound) {
        return new Random().ints(size, lowBound, highBound).toArray();
    }

    private static int count(int[] numbers, Comparison cs) {
        int count = 0;
        for (Integer number : numbers) {
            if (cs.isEqual(number)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountEvenNumbers(int[] numbers) {
        Comparison even = CustomComparison::isEven;
        return count(numbers, even);
    }
    public static int getCountOddNumbers(int[] numbers) {
        Comparison odd = CustomComparison::isOdd;
        return count(numbers, odd);
    }
    public static int getCountNumbersEqualToZero(int[] numbers) {
        Comparison equalToZero = CustomComparison::isEqualZero;
        return count(numbers, equalToZero);
    }
    public static int getCountNumbersEqualTo(int[] numbers, int number) {
        Comparison equalToNumber = (int n) -> n == number;
        return count(numbers, equalToNumber);
    }
}

