package main.并行算法.生产者与消费者;

import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingDeque;

/**
 * Created by zhouyang
 * Date 2019/2/15.
 */
public class Consumer implements Runnable {

    private BlockingDeque<PCData> queue; //内存缓冲区
    private static final int SLEEPTIME = 1000;

    public Consumer(BlockingDeque<PCData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("start Consumer id=" + Thread.currentThread().getId());
        Random r = new Random();

        try {
            while (true) {
                PCData data = queue.take();
                if (null != data) {
                    int re = data.get() * data.get();
                    System.out.println(MessageFormat.format("{0}*{1}={2}",data.get(),data.get(),re));
                    Thread.sleep(r.nextInt(SLEEPTIME));
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }


    }
}
