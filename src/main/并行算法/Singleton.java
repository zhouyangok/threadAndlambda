package main.并行算法;

/**
 * Created by zhouyang
 * Date 2019/2/15.
 */
public class Singleton {
    private Singleton() {
        System.out.println("singleton is created");
    }

    private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }
}
