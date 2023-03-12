package hw_04.runners;
import hw_04.calcs.additional.CalculatorWithCounterAutoAgregation;
import hw_04.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregation caa = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        double result;
        double res1 = caa.multiplication(15, 7);  // 15 * 7=105
        double res2 = caa.division(28, 5); // (28 / 5) = 5.6
        double res3 = caa.exponentiation(res2, 2); // (28 / 5) ^ 2 = 31.36
        double res4 = caa.sum(4.1, res1); // 4.1 + 15 * 7  = 109.1
        result = caa.sum(res4, res3);
        System.out.println(result);
        System.out.println(caa.getCountOperation());
    }
}
