package main.并行算法.生产者与消费者;

/**
 * Created by zhouyang
 * Date 2019/2/15.
 */
public class PCData {
    public PCData(int d) {
        this.intData = d;
    }

    public PCData(String d) {
        this.intData = Integer.valueOf(d);
    }

    private final int intData;

    public int get() {
        return intData;
    }

    @Override
    public String toString() {
        return "PCData{" +
                "intData=" + intData +
                '}';
    }
}
