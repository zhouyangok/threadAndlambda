package main.排序算法;

import java.util.Arrays;

/**
 * Created by zhouyang
 * Date 2019/2/19.
 * desc: 选择排序
 */

/**
 * 算法步骤：
 *
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置

 * 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。

 * 重复第二步，直到所有元素均排序完毕。
 */
public class SelectSort implements IArraySort {
    @Override
    public int[] sort(int[] sourceArray) {
        int arr[] = Arrays.copyOf(sourceArray, sourceArray.length);

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    // 记录目前能找到的最小值元素的下标
                    min = j;
                }
            }
            if(i!=min){
                int tmp = arr[i];
                arr[i]=arr[min];
                arr[min]=tmp;
            }
        }
        return new int[0];
    }
}
