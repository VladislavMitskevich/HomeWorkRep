package hw_04.runners;

import hw_04.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper ca = new CalculatorWithCounterAutoSuper();
        // 4.1 + 15 * 7 + ( 28 / 5 ) ^ 2

        double result = ca.division(28, 5);
        result = ca.exponentiation(result, 2);
        double result1 = ca.multiplication(15, 7);
        result = ca.sum(result, result1);
        result = ca.sum(4.1, result);

        System.out.println(result);
        System.out.println(ca.getCountOperation());
    }
}
