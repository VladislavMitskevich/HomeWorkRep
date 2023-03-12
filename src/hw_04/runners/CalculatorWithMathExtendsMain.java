package hw_04.runners;

import hw_04.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends ce = new CalculatorWithMathExtends();
        double result;
        double res1 = ce.multiplication(15, 7);  // 15 * 7=105
        double res2 = ce.division(28, 5); // (28 / 5) = 5.6
        double res3 = ce.exponentiation(res2, 2); // (28 / 5) ^ 2 = 31.36
        double res4 = ce.sum(4.1, res1); // 4.1 + 15 * 7  = 109.1
        result = ce.sum(res4, res3);
        System.out.println(result);
    }
}
