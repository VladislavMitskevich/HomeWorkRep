package hw_04.calcs.simple;

import hw_04.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    /**
     * Производит сложение двух чисел
     *
     * @param value1 первое число
     * @param value2 второе число
     * @return сумма двух чисел
     */
    public double sum(double value1, double value2) {
        return value1 + value2;
    }

    /**
     * Производит вычитание двух чисел
     *
     * @param reduced    первое число
     * @param deductible второе число
     * @return сумма двух чисел
     */
    public double subtraction(double reduced, double deductible) {
        return reduced - deductible;
    }

    /**
     * Производит умножение двух чисел
     *
     * @param multiplier1 первый множитель
     * @param multiplier2 второй множитель
     * @return произведение двух чисел
     */
    public double multiplication(double multiplier1, double multiplier2) {
        return multiplier1 * multiplier2;
    }

    /**
     * Производит деление двух чисел
     *
     * @param divisible делимое
     * @param divider   делитель
     * @return частное от деления
     */
    public double division(double divisible, double divider) {
        return divisible / divider;
    }

    /**
     * Находит модуль переданного числа
     *
     * @param number число
     * @return модуль переданного числа
     */
    public double absolute(double number){
        return Math.abs(number);
    }

    /**
     * возводит в степень основание
     *
     * @param basis  основание
     * @param degree натуральный показатель
     * @return результат возведения числа в степень
     */
    public double exponentiation(double basis, int degree){
        return Math.pow(basis, degree);
    }

    /**
     * вычисление корня числа
     * решение по иттерационной формуле Герона
     *
     * @param number подкореенное число
     * @return корень числа
     */
    public double sqrt(double number){
        return Math.sqrt(number);
    }
}
