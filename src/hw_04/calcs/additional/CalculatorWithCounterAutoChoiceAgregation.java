package hw_04.calcs.additional;

import hw_04.calcs.simple.CalculatorWithMathCopy;
import hw_04.calcs.simple.CalculatorWithMathExtends;
import hw_04.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    CalculatorWithOperator c1;
    CalculatorWithMathCopy c2;
    CalculatorWithMathExtends c3;
    private long count;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator) {
        this.c1 = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator) {
        this.c2 = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator) {
        this.c3 = calculator;
    }


    public void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }

    public double sum(double value1, double value2) {
        incrementCountOperation();
        double result;
        if (c1 != null) {
            result = c1.sum(value1, value2);
        } else if (c2 != null) {
            result = c2.sum(value1, value2);
        } else {
            result = c3.sum(value1, value2);
        }
        return result;
    }

    public double subtraction(double reduced, double deductible) {
        incrementCountOperation();
        double result;
        if (c1 != null) {
            result = c1.subtraction(reduced, deductible);
        } else if (c2 != null) {
            result = c2.subtraction(reduced, deductible);
        } else {
            result = c3.subtraction(reduced, deductible);
        }
        return result;
    }

    public double multiplication(double multiplier1, double multiplier2) {
        incrementCountOperation();
        double result;
        if (c1 != null) {
            result = c1.multiplication(multiplier1, multiplier2);
        } else if (c2 != null) {
            result = c2.multiplication(multiplier1, multiplier2);
        } else {
            result = c3.multiplication(multiplier1, multiplier2);
        }
        return result;
    }

    public double division(double divisible, double divider) {
        incrementCountOperation();
        double result;
        if (c1 != null) {
            result = c1.division(divisible, divider);
        } else if (c2 != null) {
            result = c2.division(divisible, divider);
        } else {

            result = c3.division(divisible, divider);
        }
        return result;
    }

    public double exponentiation(double basis, int degree) {
        incrementCountOperation();
        double result;
        if (c1 != null) {
            result = c1.exponentiation(basis, degree);
        } else if (c2 != null) {
            result = c2.exponentiation(basis, degree);
        } else {
            result = c3.exponentiation(basis, degree);
        }
        return result;
    }

    public double absolute(double number) {
        incrementCountOperation();
        double result;
        if (c1 != null) {
            result = c1.absolute(number);
        } else if (c2 != null) {
            result = c2.absolute(number);
        } else {
            result = c3.absolute(number);
        }
        return result;
    }

    public double sqrt(double number) {
        incrementCountOperation();
        double result;
        if (c1 != null) {
            result = c1.sqrt(number);
        } else if (c2 != null) {
            result = c2.sqrt(number);
        } else {
            result = c3.sqrt(number);
        }
        return result;
    }
}
