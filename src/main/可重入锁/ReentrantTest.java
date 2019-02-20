package main.可重入锁;

/**
 * Created by zhouyang
 * Date 2019/2/19.
 *
 * 可重入锁：广义上的可重入锁指的是可重复可递归调用的锁，
 * 在外层使用锁之后，在内层仍然可以使用，并且不发生死锁（前提得是同一个对象或者class），这样的锁就叫做可重入锁。
 */
public class ReentrantTest implements Runnable {

    public synchronized void get() {
        System.out.println(Thread.currentThread().getName());
        set();
    }

    public synchronized void set() {
        System.out.println(Thread.currentThread().getName());
    }

    @Override
    public void run() {
        get();
    }

    public static void main(String[] args) {
        ReentrantTest rt = new ReentrantTest();
        for(;;){
            new Thread(rt).start();
        }
    }
}
