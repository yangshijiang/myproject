package javaCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @Author: 杨世江
 * @Description: 第k个幸运数
 * @Date: 2020/8/6 10:13
 */
public class Question11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for (int i = 0; i <num ; i++) {
            long k=scanner.nextLong();
            long sum=0;
            long flag=1;
            long lastSum=0;
            while(true){
                sum+=Math.pow(2,flag);
                if (sum==k) {
                    break;
                }
                if(sum>k){
                    flag--;
                    break;
                }
                lastSum=sum;
                flag++;
            }
            ArrayList<Long> list=new ArrayList<Long>();
            sum= k-lastSum-1;
            do {
                list.add(sum%2);
                sum=sum/2;
            }while (!(sum%2==0&&sum/2==0));
            Collections.reverse(list);

            for (Long out1:list) {
                if(out1==1)
                    System.out.print(7);
                else
                    System.out.print(4);
            }
            System.out.print("\n");
        }
    }
}
