package hw_04.runners;

import hw_04.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import hw_04.calcs.simple.CalculatorWithMathCopy;
import hw_04.calcs.simple.CalculatorWithMathExtends;
import hw_04.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        // 4.1 + 15 * 7 + ( 28 / 5 ) ^ 2
        CalculatorWithCounterAutoChoiceAgregation calc1 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        CalculatorWithCounterAutoChoiceAgregation calc3 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        CalculatorWithCounterAutoChoiceAgregation calc2 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());

        double result1 = calc1.sum(4.1, calc1.sum(calc1.multiplication(15, 7), calc1.exponentiation(calc1.division(28, 5), 2)));
        System.out.println(result1);
        System.out.println(calc1.getCountOperation());

        double result2 = calc2.sum(4.1, calc2.sum(calc2.multiplication(15, 7), calc2.exponentiation(calc2.division(28, 5), 2)));
        System.out.println(result2);
        System.out.println(calc2.getCountOperation());

        double result3 = calc3.sum(4.1, calc3.sum(calc3.multiplication(15, 7), calc3.exponentiation(calc3.division(28, 5), 2)));
        System.out.println(result3);
        System.out.println(calc3.getCountOperation());
    }
}

