package hw_04.calcs.api;

public interface ICalculator {
    double sum(double value1, double value2);
    double subtraction(double reduced, double deductible);
    double multiplication(double multiplier1, double multiplier2);
    double division(double divisible, double divider);
    double absolute(double number);
    double exponentiation(double basis, int degree);
    double sqrt(double number);
}
