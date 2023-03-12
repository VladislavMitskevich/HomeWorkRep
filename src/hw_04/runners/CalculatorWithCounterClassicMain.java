package hw_04.runners;

import hw_04.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic cc = new CalculatorWithCounterClassic();
        // 4.1 + 15 * 7 + ( 28 / 5 ) ^ 2
        double result = cc.division(28, 5);
        cc.incrementCountOperation();

        result = cc.exponentiation(result, 2);
        cc.incrementCountOperation();

        double result1 = cc.multiplication(15, 7);
        cc.incrementCountOperation();

        result = cc.sum(result, result1);
        cc.incrementCountOperation();

        result = cc.sum(4.1, result);
        cc.incrementCountOperation();

        System.out.println(result);
        System.out.println(cc.getCountOperation());
    }
}
