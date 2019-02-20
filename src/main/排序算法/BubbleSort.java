package main.排序算法;

import java.util.Arrays;

/**
 * Created by zhouyang
 * Date 2019/2/19.
 * <p>
 * desc:冒泡排序
 */

/**
 * 算法步骤：
 *
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。

 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。

 * 针对所有的元素重复以上的步骤，除了最后一个。

 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class BubbleSort implements IArraySort {
    @Override
    public int[] sort(int[] sourceArray) {

        int arr[] = Arrays.copyOf(sourceArray, sourceArray.length);
        for (int i = 1; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return arr;
    }
}
