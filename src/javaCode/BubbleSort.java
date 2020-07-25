package javaCode;

/**
 * @Author: 杨世江
 * @Description: 冒泡排序
 * @Date: 2020/7/24 15:26
 */
public class BubbleSort {
    public static int[] ascSort(int[] data) {
        //用来临时存放交换时的中间数据
        int temp;
        for (int i = 1; i < data.length; i++) //外层循环，记录排序轮数，每一次循环完成代表一个数据完成冒泡
            for (int j = 0; j < data.length -i; j++) {//内层循环，用第一个数据与后面未冒泡完成的数据比较
                if (data[j] > data[j+1]) { //当前数据大于后面的一个数据则，两个数据交换
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }

        return data;
    }

    //降序排列
    public static int[] descSort(int[] data) {
        //用来临时存放交换时的中间数据
        int temp;
        for (int i = 1; i < data.length; i++) //外层循环，记录排序轮数，每一次循环完成代表一个数据完成冒泡
            for (int j = 0; j < data.length -i; j++) {//内层循环，用第一个数据与后面未冒泡完成的数据比较
                if (data[j] < data[j+1]) { //当前数据小于于后面的一个数据则，两个数据交换
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }

        return data;
    }
}
