package hw_04.runners;

import hw_04.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy cl2 = new CalculatorWithMathCopy();
        double result;
        double res1 = cl2.multiplication(15, 7);  // 15 * 7=105
        double res2 = cl2.division(28, 5); // (28 / 5) = 5.6
        double res3 = cl2.exponentiation(res2, 2); // (28 / 5) ^ 2 = 31.36
        double res4 = cl2.sum(4.1, res1); // 4.1 + 15 * 7  = 109.1
        result = cl2.sum(res4, res3);
        System.out.println(result);
    }
}
