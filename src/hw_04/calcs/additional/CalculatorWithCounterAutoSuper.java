package hw_04.calcs.additional;

import hw_04.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long countOperation = 0;

    /**
     * Производит сложение двух чисел
     *
     * @param value1 первое число
     * @param value2 второе число
     * @return сумма двух чисел
     */
    @Override
    public double sum(double value1, double value2) {
        incrementCountOperation();
        return value1 + value2;
    }


    /**
     * Производит вычитание двух чисел
     *
     * @param reduced    первое число
     * @param deductible второе число
     * @return сумма двух чисел
     */
    @Override
    public double subtraction(double reduced, double deductible) {
        incrementCountOperation();
        return reduced - deductible;
    }

    /**
     * Производит умножение двух чисел
     *
     * @param multiplier1 первый множитель
     * @param multiplier2 второй множитель
     * @return произведение двух чисел
     */
    @Override
    public double multiplication(double multiplier1, double multiplier2) {
        incrementCountOperation();
        return multiplier1 * multiplier2;
    }

    /**
     * Производит деление двух чисел
     *
     * @param divisible делимое
     * @param divider   делитель
     * @return частное от деления
     */
    @Override
    public double division(double divisible, double divider) {
        incrementCountOperation();
        return divisible / divider;
    }

    /**
     * Находит модуль переданного числа
     *
     * @param number число
     * @return модуль переданного числа
     */
    @Override
    public double absolute(double number) {
        incrementCountOperation();
        return Math.abs(number);
    }

    /**
     * возводит в степень основание
     *
     * @param basis  основание
     * @param degree натуральный показатель
     * @return результат возведения числа в степень
     */
    @Override
    public double exponentiation(double basis, int degree){
        incrementCountOperation();
        return Math.pow(basis,degree);
    }

    /**
     * вычисление корня числа
     * решение по иттерационной формуле Герона
     *
     * @param number подкореенное число
     * @return корень числа
     */
    @Override
    public double sqrt(double number){
        incrementCountOperation();
        return Math.sqrt(number);
    }

    /**
     * метод увеличивает значение счетчика на единицу
     */
    private void incrementCountOperation() {
        countOperation++;
    }

    /**
     * метод возвращает количество использований калькулятора
     * @return возвращает количество раз использования калькулятора
     */
    public long getCountOperation() {
        return countOperation;
    }
}
