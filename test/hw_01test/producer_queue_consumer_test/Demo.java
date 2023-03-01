package hw_01test.producer_queue_consumer_test;

import hw_01.producer_queue_consumer.utils.TreadUtils;

public class Demo {
    public static void main(String[] args) {

        TreadUtils threadConfig = new TreadUtils(2);

        threadConfig.start();
    }
}
