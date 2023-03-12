package hw_04.runners;

/**
 * Создать класс WithoutCalculatorMain в котором необходимо посчитать следующие выражения:
 * 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль.
 * Внимание, знак "^" обозначает возведение в степень.
 */

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double result = 4.1 + 15 * 7 + ((28.0 / 5) * (28.0 / 5));

        System.out.println(result);
    }
}
