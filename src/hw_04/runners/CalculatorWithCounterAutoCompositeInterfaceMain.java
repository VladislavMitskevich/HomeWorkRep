package hw_04.runners;

import hw_04.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import hw_04.calcs.api.ICalculator;
import hw_04.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        // 4.1 + 15 * 7 + ( 28 / 5 ) ^ 2
        ICalculator calc = new CalculatorWithOperator();
        CalculatorWithCounterAutoAgregationInterface cr = new CalculatorWithCounterAutoAgregationInterface(calc);

        double result = cr.calc.division(28, 5);
        result = cr.calc.exponentiation(result, 2);
        double result1 = cr.calc.multiplication(15, 7);
        result = cr.calc.sum(result, result1);
        result = cr.calc.sum(4.1, result);

        System.out.println(result);
        System.out.println(cr.getCountOperation());
    }
}
