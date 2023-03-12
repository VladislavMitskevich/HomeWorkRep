package hw_04.calcs.additional;

import hw_04.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {
    CalculatorWithMathCopy calculatorWithMathCopy; //Поле
    private long counter; //Счетчик

    //Конструктор
    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    public double sum (double value1, double value2){
        counter++;
        return calculatorWithMathCopy.sum(value1, value2);
    }

    public double subtraction(double reduced, double deductible) {
        counter++;
        return calculatorWithMathCopy.subtraction(reduced, deductible);
    }

    public double multiplication(double multiplier1, double multiplier2) {
        counter++;
        return calculatorWithMathCopy.multiplication(multiplier1, multiplier2);
    }

    public double division(double divisible, double divider) {
        counter++;
        return calculatorWithMathCopy.division(divisible, divider);
    }

    public double absolute(double number) {
        counter++;
        return calculatorWithMathCopy.absolute(number);
    }

    public double exponentiation(double basis, int degree) {
        counter++;
        return calculatorWithMathCopy.exponentiation(basis, degree);
    }

    public double sqrt(double number) {
        counter++;
        return calculatorWithMathCopy.sqrt(number);
    }

    //Возвращаем счетчик
    public long getCountOperation() {
        return counter;
    }
}
