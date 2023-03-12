package hw_04.calcs.additional;

import hw_04.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    public ICalculator calc;
    private long countOperation = 0;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calc = calculator;
    }
        public long getCountOperation() {
        return countOperation;
    }
}
