package main.lambda;

/**
 * Created by zhouyang
 * Date 2019/2/15.
 */
public class Lambda1Thread extends Thread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("before Java 8");
            }
        }).start();

        new Thread(()-> System.out.println("in Java 8")).start();
    }

}
