package hw_01.producer_queue_consumer.utils;

import hw_01.producer_queue_consumer.publisher.Producer;
import hw_01.producer_queue_consumer.subscriber.Consumer;

import java.util.Queue;
import java.util.concurrent.*;

public class TreadUtils {
    private Integer threadsAmount;
    private final Queue<Integer> queue;

    public TreadUtils(Integer threadsAmount) {
        this.threadsAmount = threadsAmount;
        this.queue = new PriorityBlockingQueue<>();
    }

    public void start() {
        ExecutorService executor = Executors.newFixedThreadPool(threadsAmount);

        Future<?> future = executor.submit(new Producer(queue)); //extends
        try {
            future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        for (; threadsAmount > 0; threadsAmount--) {
            executor.execute(new Consumer(queue));
        }

        executor.shutdown();
    }
}
