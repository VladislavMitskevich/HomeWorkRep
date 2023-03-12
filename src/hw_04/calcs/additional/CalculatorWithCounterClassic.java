package hw_04.calcs.additional;

import hw_04.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long countOperation = 0;

    /**
     * 5.3 В классе должен быть метод void incrementCountOperation() который должен увеличивать внутренний
     * счётчик в калькуляторе.
     */
    public void incrementCountOperation() {
        countOperation++;
    }

    /**
     * 5.4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований
     * данного калькулятора.
     */
    public long getCountOperation() {
        return countOperation;
    }
}
