package javaCode;

import java.util.Scanner;

/**
 * @Author: 杨世江
 * @Description: 求素数
 * @Date: 2020/8/7 11:21
 */
public class Prime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        if (i >= 4) {
            if (i%2==0)
                System.out.println("合数");
            else {
                int isPrime=1;
                for (int j = 3; j <= Math.sqrt(i); j += 2) {
                    if (i%j==0){
                        isPrime=0;
                        System.out.println("合数");
                        break;
                    }
                }
                if (isPrime==1){
                    System.out.println("素数");
                }
            }
        } else if (i!=1) {
            System.out.println("素数");
        }
    }
}
