package main.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zhouyang
 * Date 2019/2/15.
 *
 * 字符list过滤
 */
public class Lambda5String {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abcd", "jiijjl","s");
        List<String> filtered = strList.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
        System.out.printf("Orignal List:%s,filtered list:%s %n",strList,filtered);
    }
}
