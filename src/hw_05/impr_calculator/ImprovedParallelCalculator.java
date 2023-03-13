package hw_05.impr_calculator;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ImprovedParallelCalculator {

    /**
     * Метод для вывода суммы и массивов через один потток
     *
     * @param list коллекция целочисленных массивов
     * @return мапу с массивом и суммой чисел в массиве
     */
    public Map<int[], Integer> getArrayWithSum(Collection<int[]> list) {
        Map<int[], Integer> map = new HashMap<>();
        for (int[] array : list) {
            int sum = 0;
            for (int number : array) {
                sum += number;
            }
            map.put(array, sum);
        }
        return map;
    }

    /**
     * делает то же что и верхний метод, но используя потоки
     *
     * @param list         коллекция целочисленных массивов
     * @param numberThread количество заюзаных потоков
     * @return мапу с массивом и суммой чисел в массиве
     */
    public Map<int[], Integer> getMapWithThread(Collection<Integer> list, int numberThread) {
        Map<int[], Integer> map = new HashMap<>();
        ReentrantLock lock = new ReentrantLock();

        Runnable runThread = ()->{

        };

        ExecutorService executor = Executors.newFixedThreadPool(numberThread);
        for (; numberThread > 0; numberThread--) {
            executor.execute(runThread);
        }
        executor.shutdown();

        return map;
    }

}
