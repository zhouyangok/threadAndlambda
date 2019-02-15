package main.并行算法;

/**
 * Created by zhouyang
 * Date 2019/2/15.
 */
public class StaticSingleton {

    private StaticSingleton() {
        System.out.println("instance is create");
    }

    private static class SingletonHolder {
        private static StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
