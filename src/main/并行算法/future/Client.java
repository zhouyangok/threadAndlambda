package main.并行算法.future;

/**
 * Created by zhouyang
 * Date 2019/2/15.
 */
public class Client {
    public Data request(final String queryStr) {
        final FutureData futureData = new FutureData();
        new Thread() {
            public void run() {      //realData的构建很慢，所以在单独的线程中进行
                RealData realData = new RealData(queryStr);
                futureData.setRealData(realData);
            }
        }.start();
        return futureData;//futureData被立即返回
    }

    public static void main(String[] args) {
        Client client = new Client();
        Data data = client.request("name");
        System.out.println("请求完毕");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        //使用真实的数据
        System.out.println("等待线程");
        System.out.println("数据 = "+data.getResult());
    }

}
