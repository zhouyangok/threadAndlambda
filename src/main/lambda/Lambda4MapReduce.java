package main.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhouyang
 * Date 2019/2/15.
 */
public class Lambda4MapReduce {
    public static void main(String[] args) {
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        double total = 0;

        /**
         * before java 8
         */
        for (Integer cost : costBeforeTax) {
            double price = cost + .12 * cost;
            System.out.println(price);
            total = total + price;
        }
        System.out.println("总金额是：" + total);


        double total1 = 0;

        /**
         * java 8
         */

        costBeforeTax.stream().map((cost) -> cost + .12 * cost).forEach(System.out::println);
        double bill = costBeforeTax.stream().map((cost) -> cost + .12 * cost).reduce((sum, cost) -> sum + cost).get();
        System.out.println("总金额是：" + bill);

    }
}
