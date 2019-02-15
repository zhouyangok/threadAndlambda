package main.并行算法.future;

/**
 * Created by zhouyang
 * Date 2019/2/15.
 */
public class RealData implements Data {
    protected final String result;

    public RealData(String para) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            sb.append(para);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("realData中的操作");
        result = sb.toString();
    }

    @Override
    public String getResult() {
        return result;
    }
}
