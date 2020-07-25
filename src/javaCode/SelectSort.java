package javaCode;

import java.util.Arrays;

/**
 * @Author: 杨世江
 * @Description:选择排序
 * @Date: 2020/7/24 15:08
 */
public class SelectSort {
    /**
     * 选择排序
     * 每次选择一个最小的放在第一个位置，然后比对剩下的取最小值
     * 以此类推
     */
    public static void selectSort() {
        int[] arr = { 22, 5, 6, 9, 87, 7, 1 };
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

}
