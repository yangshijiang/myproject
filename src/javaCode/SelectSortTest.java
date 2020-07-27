package javaCode;

//import org.junit.Test;
import org.junit.jupiter.api.Test;


/**
 * @Author: 杨世江
 * @Description:
 * @Date: 2020/7/24 15:14
 */
class SelectSortTest {

    @Test
    public void selectSortTest(){
        SelectSort selectSort=new SelectSort();
        SelectSort.selectSort();
    }
    @Test
    public void binarySearch(){
        int[] arry={7,3,9,5,6,8,1};
        BubbleSort.ascSort(arry);
        BinarySearch.binarySearch(arry,5);
    }
    @Test
    public void insertSort(){
        int[] arr={7,3,9,5,6,8,1};
        InsertSort.insertSort(arr);
        //hsah iashiah5656466

    }
}