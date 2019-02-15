package main.SimpleWN;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhouyang
 * Date 2019/2/14.
 *
 * desc:堆栈去哪了
 */
public class DivTask implements Runnable {
    int a, b;

    public DivTask(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        double re = a / b;
        System.out.println(re);
    }

    public static void main(String[] args) {
        ThreadPoolExecutor pools = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                0, TimeUnit.SECONDS,
        new SynchronousQueue<Runnable>());
        for(int i=0;i<5;i++){
//            pools.submit(new DivTask(100,i));
            pools.execute(new DivTask(100,i));
        }

    }
}
