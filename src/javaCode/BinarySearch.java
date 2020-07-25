package javaCode;

/**
 * @Author: 杨世江
 * @Description: 二分查找
 * @Date: 2020/7/24 15:23
 */
public class BinarySearch {
    public static int binarySearch(int[] array, int value){
        int low = 0;
        int high = array.length-1;
        int middle;
        while(low <= high){
            middle = (low+high)/2;//0 6  4 6  6 6
            for(int i = 0;i < array.length;i++){
                System.out.print(array[i]+" ");
                if(i == middle)//3 5 6 紧随最中间的指向 后面 打印分隔符
                {
                    System.out.print("## ");
                }
            }
            System.out.println();
            if(array[middle] == value){
                return middle;
            }
            if(value < array[middle]){
                high = middle - 1;
            }
            if(value > array[middle]){
                low = middle + 1;
                int i=1;
            }

        }
        return -1;
    }
}
