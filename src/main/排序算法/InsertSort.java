package main.排序算法;

import java.util.Arrays;

/**
 * Created by zhouyang
 * Date 2019/2/20.
 *
 * desc:插入排序
 */

/**
 * 将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。

 * 从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。（
 * 如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
 */
public class InsertSort implements IArraySort {

    @Override
    public int[] sort(int[] sourceArray) {

        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        for (int i = 1; i < arr.length; i++) {
            // 记录要插入的数据
            int tmp = arr[i];
            int j = i;
            // 从已经排序的序列最右边的开始比较，找到比其小的数
            while (j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            // 存在比其小的数，插入
            if (j != i) {
                arr[j] = tmp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 3};
        InsertSort insertSort = new InsertSort();
        int[] result = insertSort.sort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
