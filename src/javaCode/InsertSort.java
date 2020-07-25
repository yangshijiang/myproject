package javaCode;


import java.util.Arrays;

/**
 * @Author: 杨世江
 * @Description: 插入排序
 * @Date: 2020/7/24 21:45
 */
public class InsertSort {
    public static void insertSort(int[] arr) {
        // 空数组 或 只有一个元素的数组，则什么都不做。
        if (arr == null || arr.length == 0) return;
        // 外层循环的 i 代表有序区的最后一个元素
        System.out.println("初始数组："+Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            // 待插入的元素暂存到value.
            int value = arr[i + 1];
            int j = i;
            // j < 0 时退出循环，说明 j 是最小的元素的索引值。
            // 或者 arr[j] <= value 时退出循环，说明 j 是比value小的元素的索引值。
            for (; j >= 0 && arr[j] > value; j--) {
                // 把元素往后挪。
                arr[j + 1] = arr[j];
            }
            // 把待插入元素，放到正确位置。
            arr[j + 1] = value;
            // 把每一趟排序的结果也输出一下
            System.out.print("第 " + (i + 1) + " 趟: ");
            System.out.println(Arrays.toString(arr));
        }
    }
}
