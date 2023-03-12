package hw_04.runners;
import hw_04.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite cs = new CalculatorWithCounterAutoComposite();
        double result;
        double res1 = cs.multiplication(15, 7);  // 15 * 7=105
        double res2 = cs.division(28, 5); // (28 / 5) = 5.6
        double res3 = cs.exponentiation(res2, 2); // (28 / 5) ^ 2 = 31.36
        double res4 = cs.sum(4.1, res1); // 4.1 + 15 * 7  = 109.1
        result = cs.sum(res4, res3);
        System.out.println(result);
        System.out.println(cs.getCounter());
    }
}
