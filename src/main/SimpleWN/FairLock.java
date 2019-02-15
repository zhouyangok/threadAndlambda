package main.SimpleWN;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhouyang
 * Date 2019/2/14.
 * desc: 公平锁
 */
public class FairLock implements Runnable {
    public static ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + " 获得了当前锁");
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        FairLock f1 = new FairLock();
        Thread t1 = new Thread(f1,"Thread-0");
        Thread t2 = new Thread(f1,"Thread-1");
        t1.start();
        t2.start();


    }
}
