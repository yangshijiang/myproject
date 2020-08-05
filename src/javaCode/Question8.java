package javaCode;

import java.util.Scanner;

/**
 * @Author: 杨世江
 * @Description:铺地砖
 * @Date: 2020/8/5 20:30
 */
public class Question8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for (int i=0;i<num;i++){
            long n=scanner.nextLong();
            long m=scanner.nextLong();
            long a=scanner.nextLong();
            long reaN,realM;
            if(n%a==0)
                reaN=n/a;
            else
                reaN=n/a+1;
            if(m%a==0)
                realM=n/a;
            else
                realM=m/a+1;
            System.out.println(realM*reaN);
        }
    }
}