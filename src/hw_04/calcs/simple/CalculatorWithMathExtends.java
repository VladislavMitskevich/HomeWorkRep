package hw_04.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator{
    @Override
    public double absolute(double number) {
        return Math.abs(number);
    }

    @Override
    public double exponentiation(double basis, int degree){
        return Math.pow(basis,degree);
    }

    @Override
    public double sqrt(double number){
        return Math.sqrt(number);
    }
}
