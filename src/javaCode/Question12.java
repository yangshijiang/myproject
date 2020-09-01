package javaCode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: 杨世江
 * @Description: 幸运数
 * @Date: 2020/8/6 12:16
 */
public class Question12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int count=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int j = 1; j <=100000 ; j++) {
            int value=j;
            int value1=j;
            int dSum=0;
            int bSum=0;
            while (value1>0){
                dSum+=value1%10;
                value1=value1/10;
            }
            while (value>0){
                bSum+=value%2;
                value=value/2;
            }
            if(dSum==bSum){
                count++;
                list.add(count);
            }
            else
                list.add(count);
        }
        for (int i = 0; i <num ; i++) {
            int max=scanner.nextInt();
            System.out.println(list.get(max-1));
        }
        scanner.close();
    }
}
