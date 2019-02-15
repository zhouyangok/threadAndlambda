package main.并行算法;

/**
 * Created by zhouyang
 * Date 2019/2/15.
 */
public class LazySingleton {
    private LazySingleton() {
        System.out.println("instance is created");
    }

    private static LazySingleton instance = null;

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
