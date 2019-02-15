package main.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhouyang
 * Date 2019/2/15.
 */
public class Lambda2List {
    public static void main(String[] args) {
        List<String> features = Arrays.asList("Lambdas", "Default Methods", "Stream API", "Date and Time API");
        List demos = Arrays.asList("Lambdas", "Default Methods", "Stream API", "Date and Time API");
        for (String feature : features) {
            System.out.println(feature);
        }

        //java8
        demos.forEach(n-> System.out.println(n));
    }
}
