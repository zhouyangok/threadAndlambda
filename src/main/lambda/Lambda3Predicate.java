package main.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by zhouyang
 * Date 2019/2/15.
 */
public class Lambda3Predicate {
    public static void main(String[] args) {

        List languages = Arrays.asList("Java", "Scala", "c++", "Python", "PHP");
        System.out.println("Languages which starts with J :");
//        filter(languages, (str) -> str.startsWith("J"));
//
//        System.out.println("Languages which ends with a ");
//        filter(languages, (str) -> str.endsWith("a"));

        System.out.println("Print all languages :");
        filter1(languages, (str) -> true);

        System.out.println("Print no language : ");
        filter(languages, (str) -> false);

        System.out.println("Print language whose length greater than 4:");
//        filter1(languages, (str) -> str.length() > 4);


    }

    public static void filter(List<String> names, Predicate condition) {
        for (String name : names) {
            if (condition.test(name)) {
                System.out.println(name + " ");
            }
        }
    }

    public static void filter1(List names, Predicate condition) {
        names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
            System.out.println(name + "");
        });
    }


    //定义多个predicate,条件过滤
    Predicate<String> startWithJ = (n)->n.startsWith("J");
    Predicate<String> fouthLenthLong = (n)->n.length()==4;
    public static void multiFilter(List names,Predicate startWithJ,Predicate fouthLenthLongwo){
        names.stream().filter(startWithJ.and(fouthLenthLongwo)).forEach(
                (n)-> System.out.println("which one"+n)
        );
    }

}
