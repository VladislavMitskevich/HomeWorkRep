package hw_04.runners;

import hw_04.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        double result = calculator.sum(
                calculator.sum(4.1, calculator.multiplication(15, 7)),
                calculator.exponentiation(calculator.division(28, 5),2));
        System.out.println("value: " + result);
    }
}

