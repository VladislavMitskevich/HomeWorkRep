package hw_05.impr_calculator;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
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
    public Map<int[], Integer> getMapWithThread(Collection<int[]> list, int numberThread) {
        Map<int[], Integer> map = new HashMap<>();
        ReentrantLock lock = new ReentrantLock();
        CopyOnWriteArrayList<int[]> listForProcessing = new CopyOnWriteArrayList<>(list); //при изменении создается
        // новая копия списка и, соответственно, происходит блокировка - чек коллекции (http://blog.yuriytkach.com/2013/09/concurrent-collections-java.html)
        String amount = String.format("Tread from %s treads", numberThread);
        long startTime = System.nanoTime(); //создаем переменную -начало работы

        Runnable runThread = () -> {
            while (!listForProcessing.isEmpty()) {
                lock.lock();
                if (!listForProcessing.isEmpty()) {
                    int[] array = listForProcessing.remove(0);
                    lock.unlock();
                    OptionalInt sum = Arrays.stream(array).reduce(Integer::sum);
                    if (sum.isPresent()) {
                        map.put(array, sum.getAsInt());
                    }
                } else {
                    lock.unlock();
                }
            }
            System.out.println(amount + " - " + (System.nanoTime() - startTime) );
        };

        ExecutorService executor = Executors.newFixedThreadPool(numberThread);
        for (; numberThread > 0; numberThread--) {
            executor.execute(runThread);
        }
        executor.shutdown();

        return map;
    }
    //где-то должна была бы быть ошибка, но чет идея не подсказала(

}
