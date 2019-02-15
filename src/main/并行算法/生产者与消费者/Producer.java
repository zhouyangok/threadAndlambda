package main.并行算法.生产者与消费者;


import java.util.Random;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zhouyang
 * Date 2019/2/15.
 */
public class Producer implements Runnable {
    private volatile boolean isRunning = true;
    private BlockingDeque<PCData> queue; //内存缓冲区
    private static AtomicInteger count = new AtomicInteger();//总数，原子操作
    private static final int SLEEPTIME = 1000;

    public Producer(BlockingDeque<PCData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        PCData data = null;
        Random r = new Random();
        System.out.println("start producer id = " + Thread.currentThread().getId());

        while (isRunning) {
            try {
                Thread.sleep(r.nextInt(SLEEPTIME));
                data = new PCData(count.incrementAndGet());
                System.out.println(data + "is put into queue");
                if (!queue.offer(data, 2, TimeUnit.SECONDS)) {
                    System.out.println("failed to put data:" + data);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }

        }
    }

    public void stop() {
        isRunning = false;
    }
}
